import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class server {
    public static void main(String[] args) throws IOException {
        // Créez un serveur HTTP qui écoute sur le port 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", new StaticFileHandler());
        server.setExecutor(null); // Utilisez l'exécuteur par défaut
        server.start();
        System.out.println("Server is listening on port 8000");
    }

    static class StaticFileHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Déterminez le chemin du fichier à servir
            String path = "src/web/index.html"; // Assurez-vous que le chemin est correct

            // Lire le fichier
            File file = new File(path);
            if (file.exists() && !file.isDirectory()) {
                byte[] fileBytes = new byte[(int) file.length()];
                FileInputStream fis = new FileInputStream(file);
                fis.read(fileBytes);
                fis.close();

                // Envoyer la réponse
                exchange.sendResponseHeaders(200, fileBytes.length);
                OutputStream os = exchange.getResponseBody();
                os.write(fileBytes);
                os.close();
            } else {
                // Si le fichier n'est pas trouvé, renvoyer une erreur 404
                String response = "404 Not Found";
                exchange.sendResponseHeaders(404, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
}
