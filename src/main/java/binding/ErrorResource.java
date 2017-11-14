package binding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResource {
	private String httpStatusCode;
	public ErrorResource(String httpStatusCode, String httpStatusMessage, String code, String message) {
		super();
		this.httpStatusCode = httpStatusCode;
		this.httpStatusMessage = httpStatusMessage;
		this.code = code;
		this.message = message;
	}

	private String httpStatusMessage;
    private String code;
    private String message;

    public ErrorResource() { }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }
    public String getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getHttpStatusMessage() {
		return httpStatusMessage;
	}

	public void setHttpStatusMessage(String httpStatusMessage) {
		this.httpStatusMessage = httpStatusMessage;
	}

  
}
