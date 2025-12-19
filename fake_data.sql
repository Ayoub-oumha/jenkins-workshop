-- Création de la base de données
CREATE DATABASE IF NOT EXISTS demo1_db;
USE demo1_db;

-- Insertion des clients
INSERT INTO client (nom, prenom, adresse) VALUES
('Dupont', 'Jean', '123 Rue de la Paix, Paris'),
('Martin', 'Marie', '456 Avenue des Champs, Lyon'),
('Bernard', 'Pierre', '789 Boulevard Saint-Michel, Marseille'),
('Durand', 'Sophie', '321 Rue Victor Hugo, Toulouse'),
('Moreau', 'Paul', '654 Place de la République, Nice');

-- Insertion des commandes
INSERT INTO commande (produit, quantite, prix, total_ht, tva, total_ttc, client_id) VALUES
('Ordinateur portable', 2, 800.00, 1600.00, 320.00, 1920.00, 1),
('Souris sans fil', 5, 25.00, 125.00, 25.00, 150.00, 1),
('Clavier mécanique', 1, 120.00, 120.00, 24.00, 144.00, 2),
('Écran 24 pouces', 3, 200.00, 600.00, 120.00, 720.00, 2),
('Imprimante laser', 1, 300.00, 300.00, 60.00, 360.00, 3),
('Webcam HD', 2, 80.00, 160.00, 32.00, 192.00, 3),
('Casque audio', 4, 50.00, 200.00, 40.00, 240.00, 4),
('Tablette graphique', 1, 150.00, 150.00, 30.00, 180.00, 4),
('Disque dur externe', 2, 90.00, 180.00, 36.00, 216.00, 5),
('Câble HDMI', 10, 15.00, 150.00, 30.00, 180.00, 5);