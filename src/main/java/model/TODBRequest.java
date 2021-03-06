package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
public class TODBRequest {
	@Id
	@Valid
	private Request request;
	@Valid
	private ResearchData research;
	@Valid
	private LegalDocReqs legal;
	@Valid
	private RepTechReqs repTech;
	@Valid
	private MiscDocReqs misDoc;
	@Valid
	private TheDisReqs theDis;
	@Valid
	private ExtPubReqs extPub;
	@Valid
	private ExtPubStatus extPubStat;
	@Valid
	@OneToMany(targetEntity=ReqRia.class, fetch=FetchType.LAZY)
	private List<ReqRia> ria;
	@Valid
	@OneToMany(targetEntity=ReqFlagship.class, fetch=FetchType.LAZY)
	private List<ReqFlagship> flag;
	@Valid
	@OneToMany(targetEntity=ReqProject.class, fetch=FetchType.LAZY)
	private List<ReqProject> proj;
	@Valid
	@OneToMany(targetEntity=ExternalAuthor.class, fetch=FetchType.LAZY)
	private List<ExternalAuthor> extAuthors;
	@Valid
	@OneToMany(targetEntity=CSIRAuthors.class, fetch=FetchType.LAZY)
	private List<CSIRAuthors> authors;

	public TODBRequest() {
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public ResearchData getResearch() {
		return research;
	}

	public void setResearch(ResearchData research) {
		this.research = research;
	}

	public LegalDocReqs getLegal() {
		return legal;
	}

	public void setLegal(LegalDocReqs legal) {
		this.legal = legal;
	}

	public RepTechReqs getRepTech() {
		return repTech;
	}

	public void setRepTech(RepTechReqs repTech) {
		this.repTech = repTech;
	}

	public MiscDocReqs getMisDoc() {
		return misDoc;
	}

	public void setMisDoc(MiscDocReqs misDoc) {
		this.misDoc = misDoc;
	}

	public TheDisReqs getTheDis() {
		return theDis;
	}

	public void setTheDis(TheDisReqs theDis) {
		this.theDis = theDis;
	}

	public ExtPubStatus getExtPubStat() {
		return extPubStat;
	}

	public void setExtPubStat(ExtPubStatus extPubStat) {
		this.extPubStat = extPubStat;
	}

	public List<ExternalAuthor> getExtAuthors() {
		return extAuthors;
	}

	public void setExtAuthors(List<ExternalAuthor> extAuthors) {
		this.extAuthors = extAuthors;
	}

	public ExtPubReqs getExtPub() {
		return extPub;
	}

	public void setExtPub(ExtPubReqs extPub) {
		this.extPub = extPub;
	}

	public List<ReqRia> getRia() {
		return ria;
	}

	public void setRia(List<ReqRia> ria) {
		this.ria = ria;
	}

	public List<ReqFlagship> getFlag() {
		return flag;
	}

	public void setFlag(List<ReqFlagship> flag) {
		this.flag = flag;
	}

	public List<ReqProject> getProj() {
		return proj;
	}

	public void setProj(List<ReqProject> proj) {
		this.proj = proj;
	}

	public List<CSIRAuthors> getAuthors() {
		return this.authors;
	}

	public void setAuthors(List<CSIRAuthors> authors) {
		this.authors = authors;
	}

}
