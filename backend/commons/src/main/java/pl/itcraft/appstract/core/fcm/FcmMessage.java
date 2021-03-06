package pl.itcraft.appstract.core.fcm;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class FcmMessage implements Serializable {
	private static final long serialVersionUID = 6098086744798358630L;
	
	private final String collapseKey;
	private final Boolean delayWhileIdle;
	private final Integer timeToLive;
	private final Map<String, String> data;
	private final Boolean dryRun;
	private final String restrictedPackageName;
	private final String priority;
	private final Boolean contentAvailable;
	private final FcmNotification notification;

	public enum Priority {
		NORMAL, HIGH
	}

	public static final class Builder {

		private final Map<String, String> data;

		// optional parameters
		private String collapseKey;
		private Boolean delayWhileIdle;
		private Integer timeToLive;
		private Boolean dryRun;
		private String restrictedPackageName;
		private String priority;
		private Boolean contentAvailable;
		private FcmNotification notification;

		public Builder() {
			this.data = new LinkedHashMap<String, String>();
		}

		/**
		 * Sets the collapseKey property.
		 */
		public Builder collapseKey(String value) {
			collapseKey = value;
			return this;
		}

		/**
		 * Sets the delayWhileIdle property (default value is {@literal false}).
		 */
		public Builder delayWhileIdle(boolean value) {
			delayWhileIdle = value;
			return this;
		}

		/**
		 * Sets the time to live, in seconds.
		 */
		public Builder timeToLive(int value) {
			timeToLive = value;
			return this;
		}

		/**
		 * Adds a key/value pair to the payload data.
		 */
		public Builder addData(String key, String value) {
			data.put(key, value);
			return this;
		}

		/**
		 * Sets the dryRun property (default value is {@literal false}).
		 */
		public Builder dryRun(boolean value) {
			dryRun = value;
			return this;
		}

		/**
		 * Sets the restrictedPackageName property.
		 */
		public Builder restrictedPackageName(String value) {
			restrictedPackageName = value;
			return this;
		}

		/**
		 * Sets the priority property.
		 */
		public Builder priority(Priority value) {
			switch (value) {
			case NORMAL:
				priority = FcmConstants.MESSAGE_PRIORITY_NORMAL;
				break;
			case HIGH:
				priority = FcmConstants.MESSAGE_PRIORITY_HIGH;
				break;
			}
			return this;
		}

		public Builder contentAvailable(boolean value) {
			contentAvailable = value;
			return this;
		}

		/**
		 * Sets the notification property.
		 */
		public Builder notification(FcmNotification value) {
			notification = value;
			return this;
		}

		public FcmMessage build() {
			return new FcmMessage(this);
		}

	}

	private FcmMessage(Builder builder) {
		collapseKey = builder.collapseKey;
		delayWhileIdle = builder.delayWhileIdle;
		data = Collections.unmodifiableMap(builder.data);
		timeToLive = builder.timeToLive;
		dryRun = builder.dryRun;
		restrictedPackageName = builder.restrictedPackageName;
		priority = builder.priority;
		contentAvailable = builder.contentAvailable;
		notification = builder.notification;
	}

	/**
	 * Gets the collapse key.
	 */
	public String getCollapseKey() {
		return collapseKey;
	}

	/**
	 * Gets the delayWhileIdle flag.
	 */
	public Boolean isDelayWhileIdle() {
		return delayWhileIdle;
	}

	/**
	 * Gets the time to live (in seconds).
	 */
	public Integer getTimeToLive() {
		return timeToLive;
	}

	/**
	 * Gets the dryRun flag.
	 */
	public Boolean isDryRun() {
		return dryRun;
	}

	/**
	 * Gets the restricted package name.
	 */
	public String getRestrictedPackageName() {
		return restrictedPackageName;
	}

	/**
	 * Gets the message priority value.
	 */
	public String getPriority() {
		return priority;
	}

	public Boolean getContentAvailable() {
		return contentAvailable;
	}

	/**
	 * Gets the payload data, which is immutable.
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * Gets notification payload, which is immutable.
	 */
	public FcmNotification getNotification() {
		return notification;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Message(");
		if (priority != null) {
			builder.append("priority=").append(priority).append(", ");
		}
		if (contentAvailable != null) {
			builder.append("contentAvailable=").append(contentAvailable).append(", ");
		}
		if (collapseKey != null) {
			builder.append("collapseKey=").append(collapseKey).append(", ");
		}
		if (timeToLive != null) {
			builder.append("timeToLive=").append(timeToLive).append(", ");
		}
		if (delayWhileIdle != null) {
			builder.append("delayWhileIdle=").append(delayWhileIdle).append(", ");
		}
		if (dryRun != null) {
			builder.append("dryRun=").append(dryRun).append(", ");
		}
		if (restrictedPackageName != null) {
			builder.append("restrictedPackageName=").append(restrictedPackageName).append(", ");
		}
		if (notification != null) {
			builder.append("notification: ").append(notification).append(", ");
		}
		if (!data.isEmpty()) {
			builder.append("data: {");
			for (Map.Entry<String, String> entry : data.entrySet()) {
				builder.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
			}
			builder.delete(builder.length() - 1, builder.length());
			builder.append("}");
		}
		if (builder.charAt(builder.length() - 1) == ' ') {
			builder.delete(builder.length() - 2, builder.length());
		}
		builder.append(")");
		return builder.toString();
	}

}
