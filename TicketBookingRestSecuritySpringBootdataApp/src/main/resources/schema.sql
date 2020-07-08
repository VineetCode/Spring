CREATE TABLE IF NOT EXISTS `ticket` (
  `ticket_Id` int(11) NOT NULL auto_increment,
  `booking_date` datetime NOT NULL,
  `dest_station` varchar(55) NOT NULL,
  `email` varchar(55) default NULL,
  `passenger_name` varchar(55) NOT NULL,
  `source_station` varchar(55) NOT NULL,
  PRIMARY KEY  (`ticket_id`)
) ;
