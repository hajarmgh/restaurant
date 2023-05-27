<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> Réservation</title>
    </head>
    <body>
        <header>
            <h1>Client Creation</h1>
        </header>
        <main>
            <form action="saveClient" method="post">
                <div>
                    <label for="nomClient"> Nom : </label>
                    <input type="text" id="nomClient" name="nomClient">
                </div>
                <div>
                    <label for="prenomClient"> Prénom : </label>
                    <input type="text" id="prenomClient" name="prenomClient">
                </div>
                <div>
                    <label for="telClient"> Téléphone : </label>
                    <input type="text" id="telClient" name="telClient">
                </div>
                <div>
                    <label for="CINClient"> CIN : </label>
                    <input type="text" id="CINClient" name="CINClient">
                </div>
                <div>
                    <label for="emailClient"> E-mail : </label>
                    <input type="email" id="emailClient" name="emailClient">
                </div>
                <div>
                    <label for="nbPersonnes"> Nombre de personnes : </label>
                    <input type="number" id="nbPersonnes" name="nbPersonnes" min="1" max="6">
                </div>
                <div>
                    <label for="dateRes"> Date de réservation : </label>
                    <input type="date" id="dateRes" name="dateRes">
                </div>

                <div>
                    <input type="submit" value="Save">
                </div>
            </form>
        </main>
    </body>
</html>


