DROP TABLE IF EXISTS products;
 
CREATE TABLE products (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  price VARCHAR(250) NOT NULL,
  image VARCHAR(250) NOT NULL
);
 
INSERT INTO products (name, description, price, image) VALUES
  ('product1', 'product1', '40€', ''),
  ('product2', 'product2', '40€', ''),
  ('product3', 'product3', '40€', '');
  