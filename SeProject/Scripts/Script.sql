select * from topcategory where topcategory_id=(select topcategory_id  from subcategory where subcategory_id =10)