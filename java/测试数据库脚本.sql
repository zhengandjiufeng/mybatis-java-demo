-- 用户表
CREATE TABLE t_mybatis_user(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), id_no INT, age INT);
INSERT INTO t_mybatis_user(name, id_no, age) VALUES('zhangsan', 18);
INSERT INTO t_mybatis_user(name, id_no, age) VALUES('lisi', 17);

-- 丈夫，妻子，孩子表 （对不起胡歌了^_^）
CREATE TABLE `t_mybatis_husband` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `wife_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='丈夫表';

INSERT INTO `t_mybatis_husband` (`id`, `name`, `wife_id`)
VALUES
	(1, '胡歌', NULL),
	(2, '邓超', 1),
	(3, '刘恺威', 2),
	(4, '罗晋', 3),
	(5, '刘烨', 4);


CREATE TABLE `t_mybatis_wife` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='妻子表';

INSERT INTO `t_mybatis_wife` (`id`, `name`)
VALUES
	(1, '孙俪'),
	(2, '杨幂'),
	(3, '唐嫣'),
	(4, '安娜伊思·马田');


CREATE TABLE `t_mybatis_children` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `alias` varchar(20) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT '0' COMMENT '0 女孩 1男孩',
  `father_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='孩子表';
INSERT INTO `t_mybatis_children` (`id`, `name`, `alias`, `sex`, `father_id`)
VALUES
	(1, '邓涵之', NULL, 1, 2),
	(2, '邓涵一', NULL, 0, 2),
	(3, '刘苡馨', '小糯米', 0, 3),
	(4, '刘诺一', NULL, 1, 5),
	(5, '刘霓娜', NULL, 0, 5);



