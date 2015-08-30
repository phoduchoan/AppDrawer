package com.faendir.lightning_launcher.appdrawer;

/*package*/ final class Constants {
    private Constants(){}

    /** Mandatory: the identifier of the script, should be something like R.raw.your_script */
    /*package*/ static final String INTENT_EXTRA_SCRIPT_ID = "i";

    /** Optional: or'ed combination of the FLAG_* constants above (default is 0) */
    /*package*/ static final String INTENT_EXTRA_SCRIPT_FLAGS = "f";

    /** Optional: name of the script (default is the activity name) */
    /*package*/ static final String INTENT_EXTRA_SCRIPT_NAME = "n";

    /** Optional: execute the script right after loading it (default is false) */
    /*package*/ static final String INTENT_EXTRA_EXECUTE_ON_LOAD = "e";

    /** Optional: delete the script right after loading and (presumably) executing it.
     * This is useful when the script is meant to configure the home screen, create items or
     * install some other scripts, and is no longer needed after this initial setup (default is false).
     */
    /*package*/ static final String INTENT_EXTRA_DELETE_AFTER_EXECUTION = "d";
}