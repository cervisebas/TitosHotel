## Crear base de datos
```SQL
CREATE DATABASE titos_hotel;
```

## Usar base de datos
```SQL
USE titos_hotel;
```

## Crear tabla habitaciones
```SQL
CREATE TABLE habitaciones (
   id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   numero INT NOT NULL,
   camas_simples INT NOT NULL,
   camas_dobles INT NOT NULL,
   precio DECIMAL (10, 2) NOT NULL
);
```
