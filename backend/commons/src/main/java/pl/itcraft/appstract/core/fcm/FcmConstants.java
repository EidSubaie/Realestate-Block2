package pl.itcraft.appstract.core.fcm;

public final class FcmConstants {

	/**
	 * Endpoint for sending messages.
	 */
	public static final String GCM_SEND_ENDPOINT = "https://fcm.googleapis.com/fcm/send";

	/**
	 * Parameter for to field.
	 */
	public static final String PARAM_TO = "to";

	/**
	 * Prefix of the topic.
	 */
	public static final String TOPIC_PREFIX = "/topics/";

	/**
	 * HTTP parameter for registration id.
	 */
	public static final String PARAM_REGISTRATION_ID = "registration_id";

	/**
	 * HTTP parameter for collapse key.
	 */
	public static final String PARAM_COLLAPSE_KEY = "collapse_key";

	/**
	 * HTTP parameter for delaying the message delivery if the device is idle.
	 */
	public static final String PARAM_DELAY_WHILE_IDLE = "delay_while_idle";

	/**
	 * HTTP parameter for telling gcm to validate the message without actually
	 * sending it.
	 */
	public static final String PARAM_DRY_RUN = "dry_run";

	/**
	 * HTTP parameter for package name that can be used to restrict message
	 * delivery by matching against the package name used to generate the
	 * registration id.
	 */
	public static final String PARAM_RESTRICTED_PACKAGE_NAME = "restricted_package_name";

	/**
	 * Prefix to HTTP parameter used to pass key-values in the message payload.
	 */
	public static final String PARAM_PAYLOAD_PREFIX = "data.";

	/**
	 * Parameter used to set the message time-to-live.
	 */
	public static final String PARAM_TIME_TO_LIVE = "time_to_live";

	/**
	 * Parameter used to set the message priority.
	 */
	public static final String PARAM_PRIORITY = "priority";

	/**
	 * Parameter used to set the message priority.
	 */
	public static final String PARAM_CONTENT_AVAILABLE = "content_available";

	/**
	 * Value used to set message priority to normal.
	 */
	public static final String MESSAGE_PRIORITY_NORMAL = "normal";

	/**
	 * Value used to set message priority to high.
	 */
	public static final String MESSAGE_PRIORITY_HIGH = "high";

	/**
	 * Token returned by GCM when a message was successfully sent.
	 */
	public static final String TOKEN_MESSAGE_ID = "id";

	/**
	 * Token returned by GCM when the requested registration id has a canonical
	 * value.
	 */
	public static final String TOKEN_CANONICAL_REG_ID = "registration_id";

	/**
	 * Token returned by GCM when there was an error sending a message.
	 */
	public static final String TOKEN_ERROR = "Error";

	/**
	 * JSON-only field representing the registration ids.
	 */
	public static final String JSON_REGISTRATION_IDS = "registration_ids";

	/**
	 * JSON-only field representing the to recipient.
	 */
	public static final String JSON_TO = "to";

	/**
	 * JSON-only field representing the payload data.
	 */
	public static final String JSON_PAYLOAD = "data";

	/**
	 * JSON-only field representing the notification payload.
	 */
	public static final String JSON_NOTIFICATION = "notification";

	/**
	 * JSON-only field representing the notification title.
	 */
	public static final String JSON_NOTIFICATION_TITLE = "title";

	/**
	 * JSON-only field representing the notification body.
	 */
	public static final String JSON_NOTIFICATION_BODY = "body";

	/**
	 * JSON-only field representing the notification icon.
	 */
	public static final String JSON_NOTIFICATION_ICON = "icon";

	/**
	 * JSON-only field representing the notification sound.
	 */
	public static final String JSON_NOTIFICATION_SOUND = "sound";

	/**
	 * JSON-only field representing the notification badge.
	 */
	public static final String JSON_NOTIFICATION_BADGE = "badge";

	/**
	 * JSON-only field representing the notification tag.
	 */
	public static final String JSON_NOTIFICATION_TAG = "tag";

	/**
	 * JSON-only field representing the notification color.
	 */
	public static final String JSON_NOTIFICATION_COLOR = "color";

	/**
	 * JSON-only field representing the notification click action.
	 */
	public static final String JSON_NOTIFICATION_CLICK_ACTION = "click_action";

	/**
	 * JSON-only field representing the notification body localization key.
	 */
	public static final String JSON_NOTIFICATION_BODY_LOC_KEY = "body_loc_key";

	/**
	 * JSON-only field representing the notification body localization values.
	 */
	public static final String JSON_NOTIFICATION_BODY_LOC_ARGS = "body_loc_args";

	/**
	 * JSON-only field representing the notification title localization key.
	 */
	public static final String JSON_NOTIFICATION_TITLE_LOC_KEY = "title_loc_key";

	/**
	 * JSON-only field representing the notification title localization values.
	 */
	public static final String JSON_NOTIFICATION_TITLE_LOC_ARGS = "title_loc_args";

	/**
	 * JSON-only field representing the number of successful messages.
	 */
	public static final String JSON_SUCCESS = "success";

	/**
	 * JSON-only field representing the number of failed messages.
	 */
	public static final String JSON_FAILURE = "failure";

	/**
	 * JSON-only field representing the number of messages with a canonical
	 * registration id.
	 */
	public static final String JSON_CANONICAL_IDS = "canonical_ids";

	/**
	 * JSON-only field representing the id of the multicast request.
	 */
	public static final String JSON_MULTICAST_ID = "multicast_id";

	/**
	 * JSON-only field representing the result of each individual request.
	 */
	public static final String JSON_RESULTS = "results";

	/**
	 * JSON-only field representing the error field of an individual request.
	 */
	public static final String JSON_ERROR = "error";

	/**
	 * JSON-only field sent by GCM when a message was successfully sent.
	 */
	public static final String JSON_MESSAGE_ID = "message_id";

	private FcmConstants() {
		throw new UnsupportedOperationException();
	}

}