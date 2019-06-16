INSERT INTO category (description) VALUES ('American');
INSERT INTO category (description) VALUES ('Italian');
INSERT INTO category (description) VALUES ('Mexican');
INSERT INTO category (description) VALUES ('Fast Food');
INSERT INTO unit_of_measure (description) VALUES ('Teaspoon');
INSERT INTO unit_of_measure (description) VALUES ('Tablespoon');
INSERT INTO unit_of_measure (description) VALUES ('Cup');
INSERT INTO unit_of_measure (description) VALUES ('Pinch');
INSERT INTO unit_of_measure (description) VALUES ('Ounce');
INSERT INTO unit_of_measure (description) VALUES ('Each');
INSERT INTO unit_of_measure (description) VALUES ('Dash');
INSERT INTO unit_of_measure (description) VALUES ('Pint');
INSERT INTO recipe (description,prep_time,cook_time,servings) VALUES ('Guacamole',10,0,3);
INSERT INTO ingredient (recipe_id,description,amount) VALUES (1,'ripe avocados',2);
INSERT INTO ingredient (recipe_id,description,amount,unit_id) VALUES (1,'Kosher salt',1,1);
INSERT INTO ingredient (recipe_id,description,amount,unit_id) VALUES (1,'fresh lime juice',1,2);
INSERT INTO recipe (description,prep_time,cook_time,servings) VALUES ('Spicy Grilled Chicken Tacos',20,15,5);
INSERT INTO ingredient (recipe_id,description,amount) VALUES (2,'chicken thighs',5);
INSERT INTO ingredient (recipe_id,description,amount,unit_id) VALUES (2,'ancho chili powder',2,2);
INSERT INTO ingredient (recipe_id,description,amount,unit_id) VALUES (2,'dried oregano',1,1);
