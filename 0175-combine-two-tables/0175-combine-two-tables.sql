# Write your MySQL query statement below
Select P.firstName ,P.lastName,A.city,A.state
from person P
left join address A
on P.personId = A.personId;