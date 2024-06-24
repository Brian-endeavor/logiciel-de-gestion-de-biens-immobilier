


CREATE TABLE BienImmobilier_bi (
        bi_id 		NUMBER(8) PRIMARY KEY,
        bi_blr_id			NUMBER(8),
		bi_type		 		VARCHAR2(10),
		bi_ville 			VARCHAR2(50),
		bi_cp 				NUMBER(8),
		bi_numRue 			NUMBER(3),
		bi_typeRue 			VARCHAR2(255),
		bi_nomRue 			VARCHAR2(255),
		bi_nbChambre		NUMBER(1),
		bi_superficie			NUMBER(3),
		bi_meubl�			VARCHAR2(3),
		bi_balcon				VARCHAR2(3),
		bi_superficieBalcon		NUMBER(3),
		bi_terrace			VARCHAR2(3),
		bi_superficieTerrace	NUMBER(3),
		bi_ann�eConstruite		NUMBER(4),
		bi_typeChauffage		VARCHAR2(50),
		bi_cour				VARCHAR2(3),
		bi_superficieCour		NUMBER(3),
		bi_jardin				VARCHAR2(3),
		bi_superficieJardin		NUMBER(4),
		bi_cave				VARCHAR2(3)
                            );
    
INSERT INTO BienImmobilier_bi
( bi_id,bi_blr_id,bi_type,bi_ville ,bi_cp,bi_numRue,bi_typeRue,bi_nomRue ,bi_nbChambre,bi_superficie,bi_meubl�,bi_balcon,bi_superficieBalcon,bi_terrace,bi_superficieTerrace,bi_ann�eConstruite,bi_typeChauffage,bi_cour,bi_superficieCour,bi_jardin,bi_superficieJardin,bi_cave) VALUES
(12324564,099776,'maison','renne',23455, 23,'avenue','robespierre',2,50,'NON','oui', 13,'NON',0,1999,'interne','oui',4,'NON',0,'NON');

    SELECT * FROM BienImmobilier_bi;

drop table Bailleur_blr;
drop table Locataire_lct;


  CREATE TABLE Bailleur_blr (
        blr_id	NUMBER(8)  PRIMARY KEY,
		blr_adresse	VARCHAR2(255),
        blr_code_postal	NUMBER(8),
        blr_nom   		VARCHAR2(50),
		blr_prenom    	VARCHAR2(50),
		blr_mail		VARCHAR2(255)

);
 INSERT INTO Bailleur_blr(blr_id,blr_adresse,blr_code_postal,blr_nom,blr_prenom,blr_mail) VALUES
   (12345678,'450 rue des verres ','34889','fallure','vali','vali@mail.com');

   SELECT * FROM Bailleur_blr;

CREATE TABLE Locataire_lct (
		lct_id 	    NUMBER(8)  PRIMARY KEY,
        lct_nom   		VARCHAR2(50),
        lct_code_postal	NUMBER(8),
		lct_prenom    	VARCHAR2(50),
        lct_adresse	    VARCHAR2(255),
		lct_mail		VARCHAR2(255));

 INSERT INTO Locataire_lct(lct_id,lct_adresse,lct_code_postal,lct_nom,lct_prenom,lct_mail) VALUES
   (345677,'789 rue des cannard ','64556','Poelle','ceprien','ceprien@mail.com');

   SELECT * FROM Locataire_lct;
  
   CREATE TABLE AUTHENTIFICATION (
	ID       NUMBER,
	PASSWORD    VARCHAR2(20),
   )
  
  CREATE TABLE BAIL_BL 
   (	"BI_ID" VARCHAR2(10 BYTE) , 
	"BL_DUREE" VARCHAR2(20 BYTE), 
	"BL_DATE_PRISE_EFFET" VARCHAR2(20 BYTE), 
	"BL_DATE_FIN_EFFECTIVE" VARCHAR2(20 BYTE), 
	"BL_FREQUENCE_REVISION" VARCHAR2(20 BYTE), 
	"BL_CAUTION" VARCHAR2(20 BYTE), 
	"BL_CHARGES" VARCHAR2(20 BYTE), 
	"BL_FRAIS_AGENCES" VARCHAR2(20 BYTE), 
	"BL_GARANT" VARCHAR2(20 BYTE), 
   )