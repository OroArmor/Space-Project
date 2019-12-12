package SpaceInvader;

public class ImagePaths {

	public static boolean resourcePack = false;
	public static String imageFolderPath = "src\\images\\defaultimages\\";

	// sub-directories
	private static String bossDir = "boss\\";
	private static String alienDir = "alien\\";
	private static String playerDir = "player\\";
	private static String titleDir = "titlescreen\\";
	private static String asteroidDir = "asteroid\\";

	// alien
	private static String alienPath = "alien.png";
	private static String aShotPath = "ashot.png";

	// asteroid
	private static String asteroidPath = "asteroid.png";

	// boss
	private static String[] bossPaths = new String[] { "boss0.png", "boss1.png", "boss2.png", "boss3.png", "boss4.png","boss5.png" };
	private static String bShotPath = "bshot.png";
	
	//title screen
	private static String beginGamePath = "begingame.png";
	private static String highScoresPath = "highscores.png";
	private static String mainMenuPath = "mainmenu.png";
	private static String titlePath = "title.png";
	
	//player
	private static String playerPath = "player.png";
	private static String pShotPath = "pshot.png";
	
	//get values
	
	//alien
	public static String getAlienPath() {
		return imageFolderPath + alienDir + alienPath;
	}
	public static String getAlienShotPath() {
		return imageFolderPath + alienDir + aShotPath;
	}

	//asteroid
	public static String getAsteroidPath() {
		return imageFolderPath + asteroidDir + asteroidPath;
	}

	//boss
	public static String getBossPath(int t) {
		return imageFolderPath + bossDir + bossPaths[t];
	}
	public static String getBossShotPath() {
		return imageFolderPath + bossDir + bShotPath;
	}
	
	//title screen
	public static String getBeginGamePath() {
		return imageFolderPath + titleDir + beginGamePath;
	}
	public static String getHighScoresPath() {
		return imageFolderPath + titleDir + highScoresPath;
	}
	public static String getMainMenuPath() {
		return imageFolderPath + titleDir + mainMenuPath;
	}
	public static String getTitlePath() {
		return imageFolderPath + titleDir + titlePath;
	}

	//player
	public static String getPlayerPath() {
		return imageFolderPath + playerDir + playerPath;
	}
	public static String getPlayerShotPath() {
		return imageFolderPath + playerDir + pShotPath;
	}
	
	//set image path
	public static void setImagePath(String newPath, boolean isResourcePack) {
// if newPath is a resource pack, just set newPath to be the folder inside resourcepacks
		if (isResourcePack) {
			imageFolderPath = "src\\images\\resourcepacks\\" + newPath;
		} else {
			imageFolderPath = newPath;
		}
	}

	private ImagePaths() {
	}
}
