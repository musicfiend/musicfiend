package io.coderazor.musicfiend.app;

public class AppConstant {


    //urls for retrieving json files
    public static final String LOCAL_DEV_JSON_URL = "http://joel.hartshorn.com/playlist.json";

    //default types for playlist
    public static final String PLAYLIST_SERIALIZE = "PLAYLIST_SERIALIZE";

    //default types for track
    public static final String DEFAULT_TRACK_ID = "0";
    public static final String DEFAULT_TRACK_GENRE_JSON = "{\"all\",\"indie\"}";
    public static final String DEFAULT_TRACK_URL = "No Url";
    public static final String DEFAULT_TRACK_ARTIST = "No Artist";
    public static final String DEFAULT_TRACK_DESCRIPTION = "No Description";
    public static final String DEFAULT_TRACK_TITLE = "No Title";
    public static final String DEFAULT_TRACK_DURATION = "000";


    // Intent extras (parameters)
    public static final String REMINDER = "reminder";
    public static final String GO_TO_CAMERA = "camera";
    public static final String ID = "id";
    public static final String LIST = "LIST";
    public static final String NORMAL = "NORMAL";

    public static final String LIST_PLAYLISTS = "LIST_PLAYLISTS";
    public static final String DATE_PICKER = "DATE_PICKER";
    public static final String NO_IMAGE = "no_image";
    public static final String NO_TIME = "No Time";
    public static final String EMPTY = "EMPTY";
    public static final String PLAYLIST_PREFIX = "playlist_";
    public static final String PLAYLIST_OR_REMINDER = "PlaylistorReminder";

    // Image storage selection
    public static final int NONE_SELECTION = 0;
    public static final int DEVICE_SELECTION = 1;
    public static final int GOOGLE_DRIVE_SELECTION = 2;
    public static final int DROP_BOX_SELECTION = 3;

    // Messages
    public static final String AUTH_MESSAGE = "Tap icon to authenticate";
    public static final String STORING_AT = "Storing at ";
    public static final String FOLDER_CREATED = "Folder created";
    public static final String FOLDER_CREATE_ERROR = "Error while creating a folder";
    public static final String IMAGE_LOCATION_SAVED_DROPBOX =  "You have set image location in dropbox";
    public static final String AUTH_ERROR_DROPBOX = "Couldn't authenticate with Dropbox:";

    public static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";
    public static final String IMAGE_SELECTION_STORAGE = "image_selection_storage";

    // Preference names
    public static final String PERSONAL_PLAYLISTS_PREFERENCE = "personal_playlists_selection";
    public static final String JPG = ".jpg";
    public static final String TODAY = "TODAY";

    public static final String TRUE = "TRUE";
    public static final String FALSE = "false";

    // Activity name
    public static final String PLAYLISTS = "My Playlists";
    public static final String SETTINGS = "Settings";
    public static final String MAKE_PLAYLISTS = "Add Playlist";

    // Drawer labels
    public static final String DRAWER_PLAYLISTS = "My Playlists";
    public static final String DRAWER_EXPANDED_PLAYLIST = "My Playlists";
    public static final String DRAWER_SETTINGS = "Settings";
    public static final String DRAWER_HELP_AND_FEEDBACK = "Help & Feedback";

    // Google drive
    public static final String GOOGLE_DRIVE_ID = "google_drive_id";
    public static final String DIALOG_ERROR = "dialog_error";
    public static final String REQUEST_CODE = "request_code";
    public static final String TMP_FILE_NAME = "tmp_file_name";
    public static final int REQ_ACCPICK = 10;
    public static final int REQ_AUTH = 20;
    public static final int REQ_RECOVER = 30;
    public static final int REQ_SCAN = 40;
    public static final String GOOGLE_DRIVE_AUTH_BOOL = "google_drive_auth_bool";
    public static final String GOOGLE_DRIVE_UPLOAD_DIR = "google_drive_upload_dir";

    // Drop box
    public static final String APP_KEY = "";//change this with drop box key
    public static final String APP_SECRET = "";//change this with drop box secret key
    public static final String ACCOUNT_PREFS_NAME = "prefs";
    public static final String ACCESS_KEY_NAME = "ACCESS_KEY";
    public static final String ACCESS_SECRET_NAME = "ACCESS_SECRET";
    public static final String DROP_BOX_UPLOAD_PATH = "parent_dir_drop_box";
    public static final String DROP_BOX_AUTH_BOOL = "drop_box_auth_bool";


}
