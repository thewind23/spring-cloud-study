DROP TABLE IF EXISTS `client_detailsdo`;
CREATE TABLE `client_detailsdo` (
  `client_id` varchar(128) NOT NULL,
  `resource_ids` varchar(256) DEFAULT NULL,
  `client_secret` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `authorized_grant_types` varchar(256) DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) DEFAULT NULL,
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity_seconds` int(11) DEFAULT NULL,
  `refresh_token_validity_seconds` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `auto_approve_scopes` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
