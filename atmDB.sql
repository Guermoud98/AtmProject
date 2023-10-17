CREATE TABLE clients (
    nom VARCHAR(20),
    prenom VARCHAR(20),
    cin VARCHAR(20),
    cardNumber VARCHAR(16) PRIMARY KEY,
    password VARCHAR(20),
    accountType VARCHAR(10),
    accountNumber VARCHAR(16)
);
select * from clients;