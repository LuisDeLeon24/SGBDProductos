create database SGBDProductos;
 
use SGBDProductos;
 
create table Productos(

	productoId int not null auto_increment,

    nombreProducto varchar(50) not null,

    marcaProducto varchar(50),

    descripcionProducto text, -- varchar sin limite

    precio decimal(10,2),

    primary key PK_productoId(productoId)

);
 
INSERT INTO Productos (nombreProducto, marcaProducto, descripcionProducto, precio) VALUES

('Laptop', 'Dell', 'Laptop de alto rendimiento con procesador Intel Core i7 y 16GB de RAM', 1200.00),

('Smartphone', 'Samsung', 'Smartphone con pantalla AMOLED de 6.4 pulgadas y 128GB de almacenamiento', 799.99),

('Televisor', 'LG', 'Televisor 4K UHD de 55 pulgadas con tecnología HDR', 650.00),

('Auriculares', 'Sony', 'Auriculares inalámbricos con cancelación de ruido y 30 horas de batería', 299.99),

('Cámara', 'Canon', 'Cámara réflex digital con sensor de 24.1 megapíxeles y grabación de video en Full HD', 450.00);

select *from Productos;
 