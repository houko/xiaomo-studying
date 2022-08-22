#!/bin/bash
pefix="log_useitem_"
sql=""
for((i=$1;i<=$2;i=$i+86400))
do
subfix=`date -d @$i +'%Y_%m_%d'`
tableName="$pefix$subfix"
select="( SELECT roleid,serverid,itemid,number,action,time FROM $tableName WHERE roleid = $3 AND number >0 and ( itemid = 240703370 OR itemid = 240703371 OR itemid = 240703372 OR itemid = 240703373 OR itemid = 240703374 OR itemid = 240102157 OR itemid = 240102158 OR itemid = 240102159 OR itemid = 240102160)) "
if [ -n "$sql" ];
then
sql="$sql union all $select"
else
sql="$select"
fi
done

sql="select tb.roleid,tb.serverid,tb.itemid,sum(tb.number),tb.action from ( $sql) as tb group by itemid"
mysql -uroot -pXY@2017_RXcq%! rxcq_ly_51wan_log_s61MERGE2 --default-character-set=utf8 -N -e "$sql"