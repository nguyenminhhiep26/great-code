CREATE DATABASE Lab10
go

USE AdventureWorks2019
SELECT*INTO Lab10.dbo.WorkOrder FROM Production.WorkOrder
go

USE Lab10
SELECT*INTO WorkOrderIX FROM WorkOrder
go

SELECT*FROM WorkOrder
SELECT*FROM WorkOrderIX
go

CREATE INDEX IX_WorkOrderID ON WorkOrderIX(WorkOrderID)
go

SELECT*FROM WorkOrder where WorkOrderID=72000
SELECT*FROM WorkOrderIX where WorkOrderID=72000
go

