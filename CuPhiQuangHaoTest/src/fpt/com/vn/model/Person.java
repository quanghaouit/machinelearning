package fpt.com.vn.model;

public class Person {
	
	private Integer age;
	private String workclass;
	private Integer fnlwgt;
	private String education;
	private Integer educationNum;
	private String maritalStatus;
	private String occupation;
	private String relationship;
	private String race;
	private String sex;
	private Integer capitalGain;
	private Integer capitalLoss;
	private Integer hoursPerWeek;
	private String nativeCountry;
	private String income;

	public Person() {

	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the workclass
	 */
	public String getWorkclass() {
		return workclass;
	}
	/**
	 * @param workclass the workclass to set
	 */
	public void setWorkclass(String workclass) {
		this.workclass = workclass;
	}
	/**
	 * @return the fnlwgt
	 */
	public Integer getFnlwgt() {
		return fnlwgt;
	}
	/**
	 * @param fnlwgt the fnlwgt to set
	 */
	public void setFnlwgt(Integer fnlwgt) {
		this.fnlwgt = fnlwgt;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @return the educationNum
	 */
	public Integer getEducationNum() {
		return educationNum;
	}
	/**
	 * @param educationNum the educationNum to set
	 */
	public void setEducationNum(Integer educationNum) {
		this.educationNum = educationNum;
	}
	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}
	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the capitalGain
	 */
	public Integer getCapitalGain() {
		return capitalGain;
	}
	/**
	 * @param capitalGain the capitalGain to set
	 */
	public void setCapitalGain(Integer capitalGain) {
		this.capitalGain = capitalGain;
	}
	/**
	 * @return the capitalLoss
	 */
	public Integer getCapitalLoss() {
		return capitalLoss;
	}
	/**
	 * @param capitalLoss the capitalLoss to set
	 */
	public void setCapitalLoss(Integer capitalLoss) {
		this.capitalLoss = capitalLoss;
	}
	/**
	 * @return the hoursPerWeek
	 */
	public Integer getHoursPerWeek() {
		return hoursPerWeek;
	}
	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(Integer hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	/**
	 * @return the nativeCountry
	 */
	public String getNativeCountry() {
		return nativeCountry;
	}
	/**
	 * @param nativeCountry the nativeCountry to set
	 */
	public void setNativeCountry(String nativeCountry) {
		this.nativeCountry = nativeCountry;
	}
	/**
	 * @return the income
	 */
	public String getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(String income) {
		this.income = income;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [age=" + age + ", workclass=" + workclass + ", fnlwgt=" + fnlwgt + ", education=" + education
				+ ", educationNum=" + educationNum + ", maritalStatus=" + maritalStatus + ", occupation=" + occupation
				+ ", relationship=" + relationship + ", race=" + race + ", sex=" + sex + ", capitalGain=" + capitalGain
				+ ", capitalLoss=" + capitalLoss + ", hoursPerWeek=" + hoursPerWeek + ", nativeCountry=" + nativeCountry
				+ ", income=" + income + "]";
	}
	
}
