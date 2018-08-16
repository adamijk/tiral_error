INSERT INTO EDI.UnifiedCustomerRequestStatus(UnifiedCustomerRequestStatusCode, UnifiedCustomerRequestStatusDescription, CreateTimestamp, CreateUserID, CreateProgramName, LastUpdateTimestamp, LastUpdateUserID, LastUpdateProgramName, EffectiveTimestamp, ExpirationTimestamp)
VALUES('PendReview','Pending Review','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('Reviewed','Reviewed','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00');

INSERT INTO EDI.UnifiedCustomerRequestReviewStatus(UnifiedCustomerRequestReviewStatusCode, UnifiedCustomerRequestReviewStatusDescription, CreateTimestamp, CreateUserID, CreateProgramName, LastUpdateTimestamp, LastUpdateUserID, LastUpdateProgramName, EffectiveTimestamp, ExpirationTimestamp)
VALUES('Accepted','Accepted After Review','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('Canceled','Review Canceled','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('Pending','Review Pending','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('Rejected','Rejected After Review','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('CancelRev','Rejected After Review','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI', '2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00'),
('Excluded','Rejected After Review','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00', '2099-08-20 05:09:28.1680000 -05:00');

INSERT INTO EDI.UnifiedCustomerRequest (UnifiedCustomerRequestID, TradingPartnerCode, OriginalTransactionSetPurposeCode, DerivedTransactionSetPurposeCode, UnifiedCustomerRequestReviewStatusCode, TransactionSetNumber, InterchangeControlNumber, ShipmentID, GroupGenerationTimestamp, MustRespondByTimestamp,  CreateTimestamp, CreateUserID, CreateProgramName, LastUpdateTimestamp, LastUpdateUserID, LastUpdateProgramName,GroupSetNumber)
VALUES(40,'AMZN','Original',null,'Pending',101,100001,'AMZN101','2016-08-19 05:09:28.0000000 -05:00','2016-09-19 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI',123),
(41,'AMZN','Original','Change','Pending',102,100002,'AMZN101','2016-08-20 05:09:28.1680000 -05:00','2016-09-20 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-20 05:10:28.1680000 -05:00','RCON266','EDI',124),
(42,'WHDC','Original','Original','Pending',202,200002,'WHDC101','2016-08-25 05:09:28.1680000 -05:00','2016-09-27 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-25 05:09:28.1680000 -05:00','RCON266','EDI',125),
(43,'FMDL','Change','Change','Pending',301,300001,'WHDC101','2016-08-19 05:09:28.1680000 -05:00','2016-09-21 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-22 05:09:28.1680000 -05:00','RCON266','EDI',126),
(44,'FMDL','Cancel',null,'Pending',302,300002,'FMDL101','2016-08-22 05:09:28.1680000 -05:00','2016-09-25 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-23 05:09:28.1680000 -05:00','RCON266','EDI',127),
(45,'FMDL','Original',null,'Pending',303,300003,'FMDL101','2016-08-23 05:09:28.1680000 -05:00','2016-09-28 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-23 05:09:28.1680000 -05:00','RCON266','EDI',128),
(46,'AMZN','Original',null,'Accepted',401,400001,'AMZN102','2016-08-25 05:10:28.1680000 -05:00','2016-09-02 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-25 05:10:28.1680000 -05:00','RCON266','EDI',129),
(47,'AMZN','Original','Change','Pending',402,400002,'AMZN103','2016-08-25 05:11:28.1680000 -05:00','2016-09-15 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-25 05:11:28.1680000 -05:00','RCON266','EDI',130),
(48,'AMZN','Change',null,'Pending',402,400002,'AMZN101','2016-08-20 05:11:28.1680000 -05:00','2016-09-15 05:09:28.0000000 -05:00','2016-06-27 05:09:28.0000000 -05:00','RCON266','EDI','2016-08-25 05:11:28.1680000 -05:00','RCON266','EDI',131);

INSERT INTO EDI.UnifiedCustomerRequestMessage(UnifiedCustomerRequestMessageID, UnifiedCustomerRequestID, UnifiedCustomerRequestMessage, CreateTimestamp, CreateUserID, CreateProgramName, LastUpdateTimestamp, LastUpdateUserID, LastUpdateProgramName)
VALUES(50,40,'{"header":{"interchangeSenderQualifier":"MUTUALLY DEFINED"}}','2016-08-19 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(51,41,'{"header":{"interchangeSenderQualifier":"MUTUALLY DEFINED"}}','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(52,42,'{"header":{"interchangeSenderQualifier":"MUTUALLY DEFINED"}}','2016-08-25 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-25 05:09:28.1680000 -05:00','RCON266','EDI'),
(53,43,'{"header":{"interchangeSenderQualifier":"MUTUALLY DEFINED"}}','2016-08-25 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-25 05:09:28.1680000 -05:00','RCON266','EDI');

INSERT INTO EDI.UnifiedCustomerRequestStatusWorkflow(UnifiedCustomerRequestWorkflowID, UnifiedCustomerRequestID, UnifiedCustomerRequestStatusCode, CreateTimestamp, CreateUserID, CreateProgramName, LastUpdateTimestamp, LastUpdateUserID, LastUpdateProgramName)
VALUES(11,40,'PendReview','2016-08-19 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(12,41,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(13,42,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(14,43,'Reviewed','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(15,44,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(17,45,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(18,46,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI'),
(19,47,'PendReview','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI','2016-08-20 05:09:28.1680000 -05:00','RCON266','EDI');
INSERT INTO ORD.OrderUnifiedCustomerRequestAssociation(OrderUnifiedCustomerRequestAssociationID,OrderID,UnifiedCustomerRequestID,CreateTimestamp,CreateUserID,CreateProgramName,LastUpdateTimestamp,LastUpdateUserID,LastUpdateProgramName)
VALUES (1,1, 40, CURRENT_TIMESTAMP, 'RCON348', 'EDI', CURRENT_TIMESTAMP, 'RCON348', 'EDI'),
(1,2, 42, CURRENT_TIMESTAMP, 'RCON348', 'EDI', CURRENT_TIMESTAMP, 'RCON348', 'EDI'),
(1,2, 43, CURRENT_TIMESTAMP, 'RCON348', 'EDI', CURRENT_TIMESTAMP, 'RCON348', 'EDI');