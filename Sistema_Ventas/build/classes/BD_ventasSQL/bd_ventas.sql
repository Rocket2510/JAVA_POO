CREATE DATABASE bd_ventas;

USE bd_ventas;

CREATE TABLE cliente (
  IdCliente int(11) NOT NULL,
  Dni varchar(8) NOT NULL,
  Nombre varchar(244) NOT NULL,
  Direccion varchar(244) NOT NULL,
  Estado varchar(1) NOT NULL
); 


CREATE TABLE detalle_ventas (
  Id_DetalleVentas int(11) NOT NULL,
  IdVentas int(11) NOT NULL,
  IdProducto int(11) NOT NULL,
  Cantidad int(11) NOT NULL,
  PrecioVenta double NOT NULL
);


CREATE TABLE producto (
  IdProducto int(11) NOT NULL,
  Nombre varchar(244) NOT NULL,
  Precio double NOT NULL,
  Stock int(11) NOT NULL,
  Estado varchar(1) NOT NULL
);


CREATE TABLE vendedor (
  IdVendedor int(11) NOT NULL,
  Dni varchar(8) NOT NULL,
  Nombre varchar(255) NOT NULL,
  Telefono varchar(12) NOT NULL,
  Estado varchar(1) DEFAULT NULL,
  User varchar(8) DEFAULT NULL
);

CREATE TABLE ventas (
  IdVentas int(11) NOT NULL,
  IdCliente int(11) NOT NULL,
  IdVendedor int(20) NOT NULL,
  NumeroSerie varchar(12) NOT NULL,
  FechaVenta date NOT NULL,
  Monto double NOT NULL,
  Estado int(1) NOT NULL
);


ALTER TABLE cliente
  ADD PRIMARY KEY (IdCliente);

ALTER TABLE detalle_ventas
  ADD PRIMARY KEY (Id_DetalleVentas);

ALTER TABLE producto
  ADD PRIMARY KEY (IdProducto);

ALTER TABLE vendedor
  ADD PRIMARY KEY (IdVendedor);

ALTER TABLE ventas
  ADD PRIMARY KEY (IdVentas);

ALTER TABLE cliente
  MODIFY IdCliente int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE detalle_ventas
  MODIFY Id_DetalleVentas int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE producto
  MODIFY IdProducto int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE vendedor
  MODIFY IdVendedor int(11) NOT NULL AUTO_INCREMENT;

ALTER TABLE ventas
  MODIFY IdVentas int(11) NOT NULL AUTO_INCREMENT;
  
  INSERT INTO vendedor (IdVendedor, Dni, Nombre, Telefono, Estado, User) 
  VALUES (NULL, '2510', 'Edgar Carrillo', '5624345678', '1', 'EC01');
