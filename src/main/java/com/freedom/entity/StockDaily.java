package com.freedom.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 股票日交易表
 * @author fushitao
 *
 */
public class StockDaily implements Serializable{
	
	private static final long serialVersionUID = -151582475474092442L;
	private BigDecimal EID;                              
	private BigDecimal ESEQID;                              
	private Timestamp EITIME;                                   
	private Timestamp EUTIME;
	private Timestamp EGETTIME;                        
	private String EISDEL;
	private Timestamp SECINNERCODE;                     
	private BigDecimal NEWHFQJ;                     
	private BigDecimal CHG;                       
	private Timestamp TRADEDATE;                     
	private BigDecimal XDFXJZDFH;                  
	private BigDecimal AVPHF500;                         
	private BigDecimal LOW;                         
	private BigDecimal AVPHF20;                         
	private BigDecimal AVVOL5;                         
	private BigDecimal AVPHF60;                         
	private BigDecimal AVPHF120;                         
	private BigDecimal PRANGE;                         
	private BigDecimal TURNRATE;                         
	private BigDecimal LCLOSE;                         
	private BigDecimal PCHG;                         
	private BigDecimal AVPHF5;                         
	private BigDecimal LCLOSEHFQJ;                         
	private BigDecimal OPENH;                         
	private BigDecimal JYNZDFHFQ;                         
	private BigDecimal JLYZDFHFQ;                         
	private BigDecimal LB;                         
	private BigDecimal BNZDFHFQ;                         
	private BigDecimal NEW;                         
	private BigDecimal AVVOL20;                         
	private BigDecimal DSCHG;                 
	private BigDecimal LXZDF;              
	private BigDecimal OPEN;            
	private BigDecimal FLBL;           
	private BigDecimal AVPHF250;           
	private BigDecimal AVPHF90;               
	private BigDecimal AVPHF10;              
	private BigDecimal BYZDFHFQ;      
	private BigDecimal JSYZDFHFQ;                     
	private BigDecimal LOWH;                         
	private BigDecimal JYYRJHSL;                         
	private BigDecimal LDTS;                         
	private BigDecimal AVPHF30;                         
	private BigDecimal SECURITYCODE;                         
	private BigDecimal JSNZDFHFQ;                         
	private BigDecimal LZTS;                         
	private BigDecimal FIZDFHFQ;                         
	private BigDecimal JYYZDFHFQ;                         
	private BigDecimal HIGH;                     
	private BigDecimal BZZDFHFQ;                         
	private BigDecimal JYYRJCJE;     
	private BigDecimal FTWPMAX;                         
	private BigDecimal FTWPMIN;                         
	private BigDecimal JEYZDFHFQ;                         
	private BigDecimal HIGHH;                         
	private BigDecimal DRCJJJ;                         
	private String ESOURCEMEMO;
	
	public BigDecimal getEID() {
		return EID;
	}
	public void setEID(BigDecimal eID) {
		EID = eID;
	}
	public BigDecimal getESEQID() {
		return ESEQID;
	}
	public void setESEQID(BigDecimal eSEQID) {
		ESEQID = eSEQID;
	}
	public Timestamp getEITIME() {
		return EITIME;
	}
	public void setEITIME(Timestamp eITIME) {
		EITIME = eITIME;
	}
	public Timestamp getEUTIME() {
		return EUTIME;
	}
	public void setEUTIME(Timestamp eUTIME) {
		EUTIME = eUTIME;
	}
	public Timestamp getEGETTIME() {
		return EGETTIME;
	}
	public void setEGETTIME(Timestamp eGETTIME) {
		EGETTIME = eGETTIME;
	}
	public String getEISDEL() {
		return EISDEL;
	}
	public void setEISDEL(String eISDEL) {
		EISDEL = eISDEL;
	}
	public Timestamp getSECINNERCODE() {
		return SECINNERCODE;
	}
	public void setSECINNERCODE(Timestamp sECINNERCODE) {
		SECINNERCODE = sECINNERCODE;
	}
	public BigDecimal getNEWHFQJ() {
		return NEWHFQJ;
	}
	public void setNEWHFQJ(BigDecimal nEWHFQJ) {
		NEWHFQJ = nEWHFQJ;
	}
	public BigDecimal getCHG() {
		return CHG;
	}
	public void setCHG(BigDecimal cHG) {
		CHG = cHG;
	}
	public Timestamp getTRADEDATE() {
		return TRADEDATE;
	}
	public void setTRADEDATE(Timestamp tRADEDATE) {
		TRADEDATE = tRADEDATE;
	}
	public BigDecimal getXDFXJZDFH() {
		return XDFXJZDFH;
	}
	public void setXDFXJZDFH(BigDecimal xDFXJZDFH) {
		XDFXJZDFH = xDFXJZDFH;
	}
	public BigDecimal getAVPHF500() {
		return AVPHF500;
	}
	public void setAVPHF500(BigDecimal aVPHF500) {
		AVPHF500 = aVPHF500;
	}
	public BigDecimal getLOW() {
		return LOW;
	}
	public void setLOW(BigDecimal lOW) {
		LOW = lOW;
	}
	public BigDecimal getAVPHF20() {
		return AVPHF20;
	}
	public void setAVPHF20(BigDecimal aVPHF20) {
		AVPHF20 = aVPHF20;
	}
	public BigDecimal getAVVOL5() {
		return AVVOL5;
	}
	public void setAVVOL5(BigDecimal aVVOL5) {
		AVVOL5 = aVVOL5;
	}
	public BigDecimal getAVPHF60() {
		return AVPHF60;
	}
	public void setAVPHF60(BigDecimal aVPHF60) {
		AVPHF60 = aVPHF60;
	}
	public BigDecimal getAVPHF120() {
		return AVPHF120;
	}
	public void setAVPHF120(BigDecimal aVPHF120) {
		AVPHF120 = aVPHF120;
	}
	public BigDecimal getPRANGE() {
		return PRANGE;
	}
	public void setPRANGE(BigDecimal pRANGE) {
		PRANGE = pRANGE;
	}
	public BigDecimal getTURNRATE() {
		return TURNRATE;
	}
	public void setTURNRATE(BigDecimal tURNRATE) {
		TURNRATE = tURNRATE;
	}
	public BigDecimal getLCLOSE() {
		return LCLOSE;
	}
	public void setLCLOSE(BigDecimal lCLOSE) {
		LCLOSE = lCLOSE;
	}
	public BigDecimal getPCHG() {
		return PCHG;
	}
	public void setPCHG(BigDecimal pCHG) {
		PCHG = pCHG;
	}
	public BigDecimal getAVPHF5() {
		return AVPHF5;
	}
	public void setAVPHF5(BigDecimal aVPHF5) {
		AVPHF5 = aVPHF5;
	}
	public BigDecimal getLCLOSEHFQJ() {
		return LCLOSEHFQJ;
	}
	public void setLCLOSEHFQJ(BigDecimal lCLOSEHFQJ) {
		LCLOSEHFQJ = lCLOSEHFQJ;
	}
	public BigDecimal getOPENH() {
		return OPENH;
	}
	public void setOPENH(BigDecimal oPENH) {
		OPENH = oPENH;
	}
	public BigDecimal getJYNZDFHFQ() {
		return JYNZDFHFQ;
	}
	public void setJYNZDFHFQ(BigDecimal jYNZDFHFQ) {
		JYNZDFHFQ = jYNZDFHFQ;
	}
	public BigDecimal getJLYZDFHFQ() {
		return JLYZDFHFQ;
	}
	public void setJLYZDFHFQ(BigDecimal jLYZDFHFQ) {
		JLYZDFHFQ = jLYZDFHFQ;
	}
	public BigDecimal getLB() {
		return LB;
	}
	public void setLB(BigDecimal lB) {
		LB = lB;
	}
	public BigDecimal getBNZDFHFQ() {
		return BNZDFHFQ;
	}
	public void setBNZDFHFQ(BigDecimal bNZDFHFQ) {
		BNZDFHFQ = bNZDFHFQ;
	}
	public BigDecimal getNEW() {
		return NEW;
	}
	public void setNEW(BigDecimal nEW) {
		NEW = nEW;
	}
	public BigDecimal getAVVOL20() {
		return AVVOL20;
	}
	public void setAVVOL20(BigDecimal aVVOL20) {
		AVVOL20 = aVVOL20;
	}
	public BigDecimal getDSCHG() {
		return DSCHG;
	}
	public void setDSCHG(BigDecimal dSCHG) {
		DSCHG = dSCHG;
	}
	public BigDecimal getLXZDF() {
		return LXZDF;
	}
	public void setLXZDF(BigDecimal lXZDF) {
		LXZDF = lXZDF;
	}
	public BigDecimal getOPEN() {
		return OPEN;
	}
	public void setOPEN(BigDecimal oPEN) {
		OPEN = oPEN;
	}
	public BigDecimal getFLBL() {
		return FLBL;
	}
	public void setFLBL(BigDecimal fLBL) {
		FLBL = fLBL;
	}
	public BigDecimal getAVPHF250() {
		return AVPHF250;
	}
	public void setAVPHF250(BigDecimal aVPHF250) {
		AVPHF250 = aVPHF250;
	}
	public BigDecimal getAVPHF90() {
		return AVPHF90;
	}
	public void setAVPHF90(BigDecimal aVPHF90) {
		AVPHF90 = aVPHF90;
	}
	public BigDecimal getAVPHF10() {
		return AVPHF10;
	}
	public void setAVPHF10(BigDecimal aVPHF10) {
		AVPHF10 = aVPHF10;
	}
	public BigDecimal getBYZDFHFQ() {
		return BYZDFHFQ;
	}
	public void setBYZDFHFQ(BigDecimal bYZDFHFQ) {
		BYZDFHFQ = bYZDFHFQ;
	}
	public BigDecimal getJSYZDFHFQ() {
		return JSYZDFHFQ;
	}
	public void setJSYZDFHFQ(BigDecimal jSYZDFHFQ) {
		JSYZDFHFQ = jSYZDFHFQ;
	}
	public BigDecimal getLOWH() {
		return LOWH;
	}
	public void setLOWH(BigDecimal lOWH) {
		LOWH = lOWH;
	}
	public BigDecimal getJYYRJHSL() {
		return JYYRJHSL;
	}
	public void setJYYRJHSL(BigDecimal jYYRJHSL) {
		JYYRJHSL = jYYRJHSL;
	}
	public BigDecimal getLDTS() {
		return LDTS;
	}
	public void setLDTS(BigDecimal lDTS) {
		LDTS = lDTS;
	}
	public BigDecimal getAVPHF30() {
		return AVPHF30;
	}
	public void setAVPHF30(BigDecimal aVPHF30) {
		AVPHF30 = aVPHF30;
	}
	public BigDecimal getSECURITYCODE() {
		return SECURITYCODE;
	}
	public void setSECURITYCODE(BigDecimal sECURITYCODE) {
		SECURITYCODE = sECURITYCODE;
	}
	public BigDecimal getJSNZDFHFQ() {
		return JSNZDFHFQ;
	}
	public void setJSNZDFHFQ(BigDecimal jSNZDFHFQ) {
		JSNZDFHFQ = jSNZDFHFQ;
	}
	public BigDecimal getLZTS() {
		return LZTS;
	}
	public void setLZTS(BigDecimal lZTS) {
		LZTS = lZTS;
	}
	public BigDecimal getFIZDFHFQ() {
		return FIZDFHFQ;
	}
	public void setFIZDFHFQ(BigDecimal fIZDFHFQ) {
		FIZDFHFQ = fIZDFHFQ;
	}
	public BigDecimal getJYYZDFHFQ() {
		return JYYZDFHFQ;
	}
	public void setJYYZDFHFQ(BigDecimal jYYZDFHFQ) {
		JYYZDFHFQ = jYYZDFHFQ;
	}
	public BigDecimal getHIGH() {
		return HIGH;
	}
	public void setHIGH(BigDecimal hIGH) {
		HIGH = hIGH;
	}
	public BigDecimal getBZZDFHFQ() {
		return BZZDFHFQ;
	}
	public void setBZZDFHFQ(BigDecimal bZZDFHFQ) {
		BZZDFHFQ = bZZDFHFQ;
	}
	public BigDecimal getJYYRJCJE() {
		return JYYRJCJE;
	}
	public void setJYYRJCJE(BigDecimal jYYRJCJE) {
		JYYRJCJE = jYYRJCJE;
	}
	public BigDecimal getFTWPMAX() {
		return FTWPMAX;
	}
	public void setFTWPMAX(BigDecimal fTWPMAX) {
		FTWPMAX = fTWPMAX;
	}
	public BigDecimal getFTWPMIN() {
		return FTWPMIN;
	}
	public void setFTWPMIN(BigDecimal fTWPMIN) {
		FTWPMIN = fTWPMIN;
	}
	public BigDecimal getJEYZDFHFQ() {
		return JEYZDFHFQ;
	}
	public void setJEYZDFHFQ(BigDecimal jEYZDFHFQ) {
		JEYZDFHFQ = jEYZDFHFQ;
	}
	public BigDecimal getHIGHH() {
		return HIGHH;
	}
	public void setHIGHH(BigDecimal hIGHH) {
		HIGHH = hIGHH;
	}
	public BigDecimal getDRCJJJ() {
		return DRCJJJ;
	}
	public void setDRCJJJ(BigDecimal dRCJJJ) {
		DRCJJJ = dRCJJJ;
	}
	public String getESOURCEMEMO() {
		return ESOURCEMEMO;
	}
	public void setESOURCEMEMO(String eSOURCEMEMO) {
		ESOURCEMEMO = eSOURCEMEMO;
	}
	@Override
	public String toString() {
		return "StockDaily [EID=" + EID + ", ESEQID=" + ESEQID + ", EITIME=" + EITIME + ", EUTIME=" + EUTIME
				+ ", EGETTIME=" + EGETTIME + ", EISDEL=" + EISDEL + ", SECINNERCODE=" + SECINNERCODE + ", NEWHFQJ="
				+ NEWHFQJ + ", CHG=" + CHG + ", TRADEDATE=" + TRADEDATE + ", XDFXJZDFH=" + XDFXJZDFH + ", AVPHF500="
				+ AVPHF500 + ", LOW=" + LOW + ", AVPHF20=" + AVPHF20 + ", AVVOL5=" + AVVOL5 + ", AVPHF60=" + AVPHF60
				+ ", AVPHF120=" + AVPHF120 + ", PRANGE=" + PRANGE + ", TURNRATE=" + TURNRATE + ", LCLOSE=" + LCLOSE
				+ ", PCHG=" + PCHG + ", AVPHF5=" + AVPHF5 + ", LCLOSEHFQJ=" + LCLOSEHFQJ + ", OPENH=" + OPENH
				+ ", JYNZDFHFQ=" + JYNZDFHFQ + ", JLYZDFHFQ=" + JLYZDFHFQ + ", LB=" + LB + ", BNZDFHFQ=" + BNZDFHFQ
				+ ", NEW=" + NEW + ", AVVOL20=" + AVVOL20 + ", DSCHG=" + DSCHG + ", LXZDF=" + LXZDF + ", OPEN=" + OPEN
				+ ", FLBL=" + FLBL + ", AVPHF250=" + AVPHF250 + ", AVPHF90=" + AVPHF90 + ", AVPHF10=" + AVPHF10
				+ ", BYZDFHFQ=" + BYZDFHFQ + ", JSYZDFHFQ=" + JSYZDFHFQ + ", LOWH=" + LOWH + ", JYYRJHSL=" + JYYRJHSL
				+ ", LDTS=" + LDTS + ", AVPHF30=" + AVPHF30 + ", SECURITYCODE=" + SECURITYCODE + ", JSNZDFHFQ="
				+ JSNZDFHFQ + ", LZTS=" + LZTS + ", FIZDFHFQ=" + FIZDFHFQ + ", JYYZDFHFQ=" + JYYZDFHFQ + ", HIGH="
				+ HIGH + ", BZZDFHFQ=" + BZZDFHFQ + ", JYYRJCJE=" + JYYRJCJE + ", FTWPMAX=" + FTWPMAX + ", FTWPMIN="
				+ FTWPMIN + ", JEYZDFHFQ=" + JEYZDFHFQ + ", HIGHH=" + HIGHH + ", DRCJJJ=" + DRCJJJ + ", ESOURCEMEMO="
				+ ESOURCEMEMO + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AVPHF10 == null) ? 0 : AVPHF10.hashCode());
		result = prime * result + ((AVPHF120 == null) ? 0 : AVPHF120.hashCode());
		result = prime * result + ((AVPHF20 == null) ? 0 : AVPHF20.hashCode());
		result = prime * result + ((AVPHF250 == null) ? 0 : AVPHF250.hashCode());
		result = prime * result + ((AVPHF30 == null) ? 0 : AVPHF30.hashCode());
		result = prime * result + ((AVPHF5 == null) ? 0 : AVPHF5.hashCode());
		result = prime * result + ((AVPHF500 == null) ? 0 : AVPHF500.hashCode());
		result = prime * result + ((AVPHF60 == null) ? 0 : AVPHF60.hashCode());
		result = prime * result + ((AVPHF90 == null) ? 0 : AVPHF90.hashCode());
		result = prime * result + ((AVVOL20 == null) ? 0 : AVVOL20.hashCode());
		result = prime * result + ((AVVOL5 == null) ? 0 : AVVOL5.hashCode());
		result = prime * result + ((BNZDFHFQ == null) ? 0 : BNZDFHFQ.hashCode());
		result = prime * result + ((BYZDFHFQ == null) ? 0 : BYZDFHFQ.hashCode());
		result = prime * result + ((BZZDFHFQ == null) ? 0 : BZZDFHFQ.hashCode());
		result = prime * result + ((CHG == null) ? 0 : CHG.hashCode());
		result = prime * result + ((DRCJJJ == null) ? 0 : DRCJJJ.hashCode());
		result = prime * result + ((DSCHG == null) ? 0 : DSCHG.hashCode());
		result = prime * result + ((EGETTIME == null) ? 0 : EGETTIME.hashCode());
		result = prime * result + ((EID == null) ? 0 : EID.hashCode());
		result = prime * result + ((EISDEL == null) ? 0 : EISDEL.hashCode());
		result = prime * result + ((EITIME == null) ? 0 : EITIME.hashCode());
		result = prime * result + ((ESEQID == null) ? 0 : ESEQID.hashCode());
		result = prime * result + ((ESOURCEMEMO == null) ? 0 : ESOURCEMEMO.hashCode());
		result = prime * result + ((EUTIME == null) ? 0 : EUTIME.hashCode());
		result = prime * result + ((FIZDFHFQ == null) ? 0 : FIZDFHFQ.hashCode());
		result = prime * result + ((FLBL == null) ? 0 : FLBL.hashCode());
		result = prime * result + ((FTWPMAX == null) ? 0 : FTWPMAX.hashCode());
		result = prime * result + ((FTWPMIN == null) ? 0 : FTWPMIN.hashCode());
		result = prime * result + ((HIGH == null) ? 0 : HIGH.hashCode());
		result = prime * result + ((HIGHH == null) ? 0 : HIGHH.hashCode());
		result = prime * result + ((JEYZDFHFQ == null) ? 0 : JEYZDFHFQ.hashCode());
		result = prime * result + ((JLYZDFHFQ == null) ? 0 : JLYZDFHFQ.hashCode());
		result = prime * result + ((JSNZDFHFQ == null) ? 0 : JSNZDFHFQ.hashCode());
		result = prime * result + ((JSYZDFHFQ == null) ? 0 : JSYZDFHFQ.hashCode());
		result = prime * result + ((JYNZDFHFQ == null) ? 0 : JYNZDFHFQ.hashCode());
		result = prime * result + ((JYYRJCJE == null) ? 0 : JYYRJCJE.hashCode());
		result = prime * result + ((JYYRJHSL == null) ? 0 : JYYRJHSL.hashCode());
		result = prime * result + ((JYYZDFHFQ == null) ? 0 : JYYZDFHFQ.hashCode());
		result = prime * result + ((LB == null) ? 0 : LB.hashCode());
		result = prime * result + ((LCLOSE == null) ? 0 : LCLOSE.hashCode());
		result = prime * result + ((LCLOSEHFQJ == null) ? 0 : LCLOSEHFQJ.hashCode());
		result = prime * result + ((LDTS == null) ? 0 : LDTS.hashCode());
		result = prime * result + ((LOW == null) ? 0 : LOW.hashCode());
		result = prime * result + ((LOWH == null) ? 0 : LOWH.hashCode());
		result = prime * result + ((LXZDF == null) ? 0 : LXZDF.hashCode());
		result = prime * result + ((LZTS == null) ? 0 : LZTS.hashCode());
		result = prime * result + ((NEW == null) ? 0 : NEW.hashCode());
		result = prime * result + ((NEWHFQJ == null) ? 0 : NEWHFQJ.hashCode());
		result = prime * result + ((OPEN == null) ? 0 : OPEN.hashCode());
		result = prime * result + ((OPENH == null) ? 0 : OPENH.hashCode());
		result = prime * result + ((PCHG == null) ? 0 : PCHG.hashCode());
		result = prime * result + ((PRANGE == null) ? 0 : PRANGE.hashCode());
		result = prime * result + ((SECINNERCODE == null) ? 0 : SECINNERCODE.hashCode());
		result = prime * result + ((SECURITYCODE == null) ? 0 : SECURITYCODE.hashCode());
		result = prime * result + ((TRADEDATE == null) ? 0 : TRADEDATE.hashCode());
		result = prime * result + ((TURNRATE == null) ? 0 : TURNRATE.hashCode());
		result = prime * result + ((XDFXJZDFH == null) ? 0 : XDFXJZDFH.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockDaily other = (StockDaily) obj;
		if (AVPHF10 == null) {
			if (other.AVPHF10 != null)
				return false;
		} else if (!AVPHF10.equals(other.AVPHF10))
			return false;
		if (AVPHF120 == null) {
			if (other.AVPHF120 != null)
				return false;
		} else if (!AVPHF120.equals(other.AVPHF120))
			return false;
		if (AVPHF20 == null) {
			if (other.AVPHF20 != null)
				return false;
		} else if (!AVPHF20.equals(other.AVPHF20))
			return false;
		if (AVPHF250 == null) {
			if (other.AVPHF250 != null)
				return false;
		} else if (!AVPHF250.equals(other.AVPHF250))
			return false;
		if (AVPHF30 == null) {
			if (other.AVPHF30 != null)
				return false;
		} else if (!AVPHF30.equals(other.AVPHF30))
			return false;
		if (AVPHF5 == null) {
			if (other.AVPHF5 != null)
				return false;
		} else if (!AVPHF5.equals(other.AVPHF5))
			return false;
		if (AVPHF500 == null) {
			if (other.AVPHF500 != null)
				return false;
		} else if (!AVPHF500.equals(other.AVPHF500))
			return false;
		if (AVPHF60 == null) {
			if (other.AVPHF60 != null)
				return false;
		} else if (!AVPHF60.equals(other.AVPHF60))
			return false;
		if (AVPHF90 == null) {
			if (other.AVPHF90 != null)
				return false;
		} else if (!AVPHF90.equals(other.AVPHF90))
			return false;
		if (AVVOL20 == null) {
			if (other.AVVOL20 != null)
				return false;
		} else if (!AVVOL20.equals(other.AVVOL20))
			return false;
		if (AVVOL5 == null) {
			if (other.AVVOL5 != null)
				return false;
		} else if (!AVVOL5.equals(other.AVVOL5))
			return false;
		if (BNZDFHFQ == null) {
			if (other.BNZDFHFQ != null)
				return false;
		} else if (!BNZDFHFQ.equals(other.BNZDFHFQ))
			return false;
		if (BYZDFHFQ == null) {
			if (other.BYZDFHFQ != null)
				return false;
		} else if (!BYZDFHFQ.equals(other.BYZDFHFQ))
			return false;
		if (BZZDFHFQ == null) {
			if (other.BZZDFHFQ != null)
				return false;
		} else if (!BZZDFHFQ.equals(other.BZZDFHFQ))
			return false;
		if (CHG == null) {
			if (other.CHG != null)
				return false;
		} else if (!CHG.equals(other.CHG))
			return false;
		if (DRCJJJ == null) {
			if (other.DRCJJJ != null)
				return false;
		} else if (!DRCJJJ.equals(other.DRCJJJ))
			return false;
		if (DSCHG == null) {
			if (other.DSCHG != null)
				return false;
		} else if (!DSCHG.equals(other.DSCHG))
			return false;
		if (EGETTIME == null) {
			if (other.EGETTIME != null)
				return false;
		} else if (!EGETTIME.equals(other.EGETTIME))
			return false;
		if (EID == null) {
			if (other.EID != null)
				return false;
		} else if (!EID.equals(other.EID))
			return false;
		if (EISDEL == null) {
			if (other.EISDEL != null)
				return false;
		} else if (!EISDEL.equals(other.EISDEL))
			return false;
		if (EITIME == null) {
			if (other.EITIME != null)
				return false;
		} else if (!EITIME.equals(other.EITIME))
			return false;
		if (ESEQID == null) {
			if (other.ESEQID != null)
				return false;
		} else if (!ESEQID.equals(other.ESEQID))
			return false;
		if (ESOURCEMEMO == null) {
			if (other.ESOURCEMEMO != null)
				return false;
		} else if (!ESOURCEMEMO.equals(other.ESOURCEMEMO))
			return false;
		if (EUTIME == null) {
			if (other.EUTIME != null)
				return false;
		} else if (!EUTIME.equals(other.EUTIME))
			return false;
		if (FIZDFHFQ == null) {
			if (other.FIZDFHFQ != null)
				return false;
		} else if (!FIZDFHFQ.equals(other.FIZDFHFQ))
			return false;
		if (FLBL == null) {
			if (other.FLBL != null)
				return false;
		} else if (!FLBL.equals(other.FLBL))
			return false;
		if (FTWPMAX == null) {
			if (other.FTWPMAX != null)
				return false;
		} else if (!FTWPMAX.equals(other.FTWPMAX))
			return false;
		if (FTWPMIN == null) {
			if (other.FTWPMIN != null)
				return false;
		} else if (!FTWPMIN.equals(other.FTWPMIN))
			return false;
		if (HIGH == null) {
			if (other.HIGH != null)
				return false;
		} else if (!HIGH.equals(other.HIGH))
			return false;
		if (HIGHH == null) {
			if (other.HIGHH != null)
				return false;
		} else if (!HIGHH.equals(other.HIGHH))
			return false;
		if (JEYZDFHFQ == null) {
			if (other.JEYZDFHFQ != null)
				return false;
		} else if (!JEYZDFHFQ.equals(other.JEYZDFHFQ))
			return false;
		if (JLYZDFHFQ == null) {
			if (other.JLYZDFHFQ != null)
				return false;
		} else if (!JLYZDFHFQ.equals(other.JLYZDFHFQ))
			return false;
		if (JSNZDFHFQ == null) {
			if (other.JSNZDFHFQ != null)
				return false;
		} else if (!JSNZDFHFQ.equals(other.JSNZDFHFQ))
			return false;
		if (JSYZDFHFQ == null) {
			if (other.JSYZDFHFQ != null)
				return false;
		} else if (!JSYZDFHFQ.equals(other.JSYZDFHFQ))
			return false;
		if (JYNZDFHFQ == null) {
			if (other.JYNZDFHFQ != null)
				return false;
		} else if (!JYNZDFHFQ.equals(other.JYNZDFHFQ))
			return false;
		if (JYYRJCJE == null) {
			if (other.JYYRJCJE != null)
				return false;
		} else if (!JYYRJCJE.equals(other.JYYRJCJE))
			return false;
		if (JYYRJHSL == null) {
			if (other.JYYRJHSL != null)
				return false;
		} else if (!JYYRJHSL.equals(other.JYYRJHSL))
			return false;
		if (JYYZDFHFQ == null) {
			if (other.JYYZDFHFQ != null)
				return false;
		} else if (!JYYZDFHFQ.equals(other.JYYZDFHFQ))
			return false;
		if (LB == null) {
			if (other.LB != null)
				return false;
		} else if (!LB.equals(other.LB))
			return false;
		if (LCLOSE == null) {
			if (other.LCLOSE != null)
				return false;
		} else if (!LCLOSE.equals(other.LCLOSE))
			return false;
		if (LCLOSEHFQJ == null) {
			if (other.LCLOSEHFQJ != null)
				return false;
		} else if (!LCLOSEHFQJ.equals(other.LCLOSEHFQJ))
			return false;
		if (LDTS == null) {
			if (other.LDTS != null)
				return false;
		} else if (!LDTS.equals(other.LDTS))
			return false;
		if (LOW == null) {
			if (other.LOW != null)
				return false;
		} else if (!LOW.equals(other.LOW))
			return false;
		if (LOWH == null) {
			if (other.LOWH != null)
				return false;
		} else if (!LOWH.equals(other.LOWH))
			return false;
		if (LXZDF == null) {
			if (other.LXZDF != null)
				return false;
		} else if (!LXZDF.equals(other.LXZDF))
			return false;
		if (LZTS == null) {
			if (other.LZTS != null)
				return false;
		} else if (!LZTS.equals(other.LZTS))
			return false;
		if (NEW == null) {
			if (other.NEW != null)
				return false;
		} else if (!NEW.equals(other.NEW))
			return false;
		if (NEWHFQJ == null) {
			if (other.NEWHFQJ != null)
				return false;
		} else if (!NEWHFQJ.equals(other.NEWHFQJ))
			return false;
		if (OPEN == null) {
			if (other.OPEN != null)
				return false;
		} else if (!OPEN.equals(other.OPEN))
			return false;
		if (OPENH == null) {
			if (other.OPENH != null)
				return false;
		} else if (!OPENH.equals(other.OPENH))
			return false;
		if (PCHG == null) {
			if (other.PCHG != null)
				return false;
		} else if (!PCHG.equals(other.PCHG))
			return false;
		if (PRANGE == null) {
			if (other.PRANGE != null)
				return false;
		} else if (!PRANGE.equals(other.PRANGE))
			return false;
		if (SECINNERCODE == null) {
			if (other.SECINNERCODE != null)
				return false;
		} else if (!SECINNERCODE.equals(other.SECINNERCODE))
			return false;
		if (SECURITYCODE == null) {
			if (other.SECURITYCODE != null)
				return false;
		} else if (!SECURITYCODE.equals(other.SECURITYCODE))
			return false;
		if (TRADEDATE == null) {
			if (other.TRADEDATE != null)
				return false;
		} else if (!TRADEDATE.equals(other.TRADEDATE))
			return false;
		if (TURNRATE == null) {
			if (other.TURNRATE != null)
				return false;
		} else if (!TURNRATE.equals(other.TURNRATE))
			return false;
		if (XDFXJZDFH == null) {
			if (other.XDFXJZDFH != null)
				return false;
		} else if (!XDFXJZDFH.equals(other.XDFXJZDFH))
			return false;
		return true;
	}
	
	
	
}
