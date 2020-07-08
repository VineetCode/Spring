 INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('sean', '$2a$10$K2lSNo4Y/taIgjonc1UHEO/882m78/xutwgg6Ib.35Zd1OKOZawXy', 'Sean Murphy', 'ROLE_ADMIN', 'US', 1),
	('martin', '$2a$10$1IO1uCOQKb4s7fd92Ja4cOMYrMUUoAZzkYbMWtb./ARkj9O4SeyVe', 'Martin Bingel', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');