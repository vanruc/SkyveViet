package modules.admin.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractTransientBean;

/**
 * Document Creator
 * 
 * @stereotype "transient"
 */
@XmlType
@XmlRootElement
public class DocumentCreator extends AbstractTransientBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "admin";
	/** @hidden */
	public static final String DOCUMENT_NAME = "DocumentCreator";

	/** @hidden */
	public static final String outputLocationPropertyName = "outputLocation";
	/** @hidden */
	public static final String scriptPropertyName = "script";
	/** @hidden */
	public static final String documentPreviewPropertyName = "documentPreview";
	/** @hidden */
	public static final String markdownPreviewPropertyName = "markdownPreview";
	/** @hidden */
	public static final String errorsPropertyName = "errors";
	/** @hidden */
	public static final String defaultModulePropertyName = "defaultModule";

	/**
	 * admin.documentCreator.outputLocation.displayName
	 * <br/>
	 * admin.documentCreator.outputLocation.description
	 **/
	private String outputLocation;
	/**
	 * admin.documentCreator.script.displayName
	 **/
	private String script;
	/**
	 * admin.documentCreator.documentPreview.displayName
	 **/
	private String documentPreview;
	/**
	 * admin.documentCreator.markdownPreview.displayName
	 **/
	private String markdownPreview;
	/**
	 * admin.documentCreator.errors.displayName
	 **/
	private String errors;
	/**
	 * admin.documentCreator.defaultModule.displayName
	 * <br/>
	 * admin.documentCreator.defaultModule.description
	 **/
	private String defaultModule;

	@Override
	@XmlTransient
	public String getBizModule() {
		return DocumentCreator.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return DocumentCreator.DOCUMENT_NAME;
	}

	public static DocumentCreator newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Document Creator", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof DocumentCreator) && 
					this.getBizId().equals(((DocumentCreator) o).getBizId()));
	}

	/**
	 * {@link #outputLocation} accessor.
	 * @return	The value.
	 **/
	public String getOutputLocation() {
		return outputLocation;
	}

	/**
	 * {@link #outputLocation} mutator.
	 * @param outputLocation	The new value.
	 **/
	@XmlElement
	public void setOutputLocation(String outputLocation) {
		preset(outputLocationPropertyName, outputLocation);
		this.outputLocation = outputLocation;
	}

	/**
	 * {@link #script} accessor.
	 * @return	The value.
	 **/
	public String getScript() {
		return script;
	}

	/**
	 * {@link #script} mutator.
	 * @param script	The new value.
	 **/
	@XmlElement
	public void setScript(String script) {
		preset(scriptPropertyName, script);
		this.script = script;
	}

	/**
	 * {@link #documentPreview} accessor.
	 * @return	The value.
	 **/
	public String getDocumentPreview() {
		return documentPreview;
	}

	/**
	 * {@link #documentPreview} mutator.
	 * @param documentPreview	The new value.
	 **/
	@XmlElement
	public void setDocumentPreview(String documentPreview) {
		preset(documentPreviewPropertyName, documentPreview);
		this.documentPreview = documentPreview;
	}

	/**
	 * {@link #markdownPreview} accessor.
	 * @return	The value.
	 **/
	public String getMarkdownPreview() {
		return markdownPreview;
	}

	/**
	 * {@link #markdownPreview} mutator.
	 * @param markdownPreview	The new value.
	 **/
	@XmlElement
	public void setMarkdownPreview(String markdownPreview) {
		preset(markdownPreviewPropertyName, markdownPreview);
		this.markdownPreview = markdownPreview;
	}

	/**
	 * {@link #errors} accessor.
	 * @return	The value.
	 **/
	public String getErrors() {
		return errors;
	}

	/**
	 * {@link #errors} mutator.
	 * @param errors	The new value.
	 **/
	@XmlElement
	public void setErrors(String errors) {
		preset(errorsPropertyName, errors);
		this.errors = errors;
	}

	/**
	 * {@link #defaultModule} accessor.
	 * @return	The value.
	 **/
	public String getDefaultModule() {
		return defaultModule;
	}

	/**
	 * {@link #defaultModule} mutator.
	 * @param defaultModule	The new value.
	 **/
	@XmlElement
	public void setDefaultModule(String defaultModule) {
		preset(defaultModulePropertyName, defaultModule);
		this.defaultModule = defaultModule;
	}

	/**
	 * hasErrors
	 *
	 * @return The condition
	 */
	@XmlTransient
	public boolean isHasErrors() {
		return (getErrors() != null && getErrors().length() > 0);
	}

	/**
	 * {@link #isHasErrors} negation.
	 *
	 * @return The negated condition
	 */
	public boolean isNotHasErrors() {
		return (! isHasErrors());
	}
}
