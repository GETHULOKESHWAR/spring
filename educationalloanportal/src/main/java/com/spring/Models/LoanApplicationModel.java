package com.spring.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class LoanApplicationModel {
@Id
private int loanId;
private String loantype;
private String applicantName;
private String applicantAddress;
private String applicantMobile;
private String applicantEmail;
private String applicantAadhaar;
private String applicationPan;
private String applicationSalary;
private String loanAmountRequired;
private String loanRepaymentMonths;
private int DocumentId;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getLoantype() {
	return loantype;
}
public void setLoantype(String loantype) {
	this.loantype = loantype;
}
public String getApplicantName() {
	return applicantName;
}
public void setApplicantName(String applicantName) {
	this.applicantName = applicantName;
}
public String getApplicantAddress() {
	return applicantAddress;
}
public void setApplicantAddress(String applicantAddress) {
	this.applicantAddress = applicantAddress;
}
public String getApplicantMobile() {
	return applicantMobile;
}
public void setApplicantMobile(String applicantMobile) {
	this.applicantMobile = applicantMobile;
}
public String getApplicantEmail() {
	return applicantEmail;
}
public void setApplicantEmail(String applicantEmail) {
	this.applicantEmail = applicantEmail;
}
public String getApplicantAadhaar() {
	return applicantAadhaar;
}
public void setApplicantAadhaar(String applicantAadhaar) {
	this.applicantAadhaar = applicantAadhaar;
}
public String getApplicationPan() {
	return applicationPan;
}
public void setApplicationPan(String applicationPan) {
	this.applicationPan = applicationPan;
}
public String getApplicationSalary() {
	return applicationSalary;
}
public void setApplicationSalary(String applicationSalary) {
	this.applicationSalary = applicationSalary;
}
public String getLoanAmountRequired() {
	return loanAmountRequired;
}
public void setLoanAmountRequired(String loanAmountRequired) {
	this.loanAmountRequired = loanAmountRequired;
}
public String getLoanRepaymentMonths() {
	return loanRepaymentMonths;
}
public void setLoanRepaymentMonths(String loanRepaymentMonths) {
	this.loanRepaymentMonths = loanRepaymentMonths;
}
public int getDocumentId() {
	return DocumentId;
}
public void setDocumentId(int documentId) {
	DocumentId = documentId;
}
}
