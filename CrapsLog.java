package crapsProject_1;

import java.io.File;
import java.io.IOException;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class CrapsLog {
		
		//create a logger to write to 'craps_project.CrapsLog'
		private final static Logger LOGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		static int rebuy;
		static int cashout;
		static int newBalance;
		
		public static void setLogr() {
			
			LogManager.getLogManager().reset();
			LOGR.setLevel(Level.ALL);
			ConsoleHandler ch = new ConsoleHandler();
			ch.setLevel(Level.WARNING);
			LOGR.addHandler(ch);
			File crapsFile = new File("CrapsLog.log");
			
			if(crapsFile.exists()) {
				try {
					crapsFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			FileHandler fh;
			try {
				fh = new FileHandler("CrapsLog.log", true);
				fh.setFormatter(new SimpleFormatter());
				fh.setLevel(Level.INFO);
				LOGR.addHandler(fh);
			} catch (SecurityException e) {
				LOGR.log(Level.SEVERE, "File logger is not working.", e);
			} catch (IOException e) {
				LOGR.log(Level.SEVERE, "File logger is not working.", e);
			}

			LOGR.setLevel(Level.INFO);
			
		}
		
		public static void player1() {
			setLogr();
			LOGR.log(Level.INFO , Player.playerId());
		}
		
		public static void bankroll() {
			setLogr();
			LOGR.log(Level.INFO, "$" + Bankroll.balance());

		}
		
		public static void rebuy() {
			setLogr();
			rebuy = Bankroll.rebuy();
			LOGR.log(Level.INFO, "$" + rebuy);
		}
		public static void cashout() {
			setLogr();
			cashout = Bankroll.cashOut();
			LOGR.log(Level.INFO , "$" + cashout);
		}
		
	}

