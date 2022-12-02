package edu.bu.met.cs665.EmailGeneration;

/**
 * Name: Cecilia Chacko
 * Date: 10/17/2022
 * Description: This class creates a single email.
 */
public class Email {
    private String emailSubject;
    private String emailBody;
    private String emailClosing;

    /**
     * Sets the subject of the email.
     *
     * @param emailSubject
     */
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * Sets the body of the email.
     *
     * @param emailBody
     */
    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    /**
     * Sets the closing of the email.
     *
     * @param emailClosing
     */
    public void setEmailClosing(String emailClosing) {
        this.emailClosing = emailClosing;
    }

    /**
     * Returns a string representation of the email.
     *
     * @return a string representation of the email
     */
    public String toString() {
        return "\n" + this.emailSubject + "\n" + this.emailBody + "\n" + this.emailClosing;
    }
}
