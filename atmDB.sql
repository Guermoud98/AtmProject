USE atmApp;
CREATE TABLE client (
nom	varchar(20),
prenom varchar(20),
cin varchar(20),
cardNumber varchar(16),
password varchar(20),
accountType varchar(10),
accountNumber varchar(16),
);
select * from client;
INSERT INTO client (nom, prenom, cin, cardNumber, password, accountType, accountNumber)
VALUES
    ('Smith', 'John', '1234567890', '1234567890123456', 'password123', 'Savings', '9876543210123456'),
    ('Doe', 'Jane', '0987654321', '6543210987654321', 'secret456', 'Checking', '1234567890654321');
