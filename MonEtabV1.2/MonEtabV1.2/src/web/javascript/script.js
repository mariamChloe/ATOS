// scripts.js
document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Empêche le comportement par défaut du formulaire

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Effectuer une requête POST vers le serveur pour vérifier les informations de connexion
    fetch('/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: new URLSearchParams({
            'username': username,
            'password': password
        })
    })
        .then(response => {
            if (response.ok) {
                // Rediriger vers le tableau de bord en cas de succès
                window.location.href = '/tableau-de-bord';
            } else {
                alert('Identifiant ou mot de passe incorrect.');
            }
        })
        .catch(error => {
            console.error('Erreur:', error);
        });
});
