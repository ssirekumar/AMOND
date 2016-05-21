package amond.android.device.main;

import amond.android.supported.TerminalOperations;
import amond.android.supported.PlatformUtils;
import amond.android.supported.DeviceInfoHandling;

public class InfoAndroid {

	private static boolean args2;

	/**
	 * @author Ssire(Siri) Kumar Puttagunta
	 * @mail ssirekumar@gmail.com 
	 * @version AMOND v2.1
	 * @param amond -c <Device number>
	 * @param amond -csv <Device number>
	 * @param amond -config -c <Device number>
	 * @param amond -config -csv <Device number>
	 * @return Complete details about android mobile firmware/hardware.
	 */
	public static void main(String[] args) {
		// System.out.println(SeleResourceUtil.getOSName());
		try {
			if (args.length < 2) {
				throw new Exception(
						"Mandatory arguments should not be less than 2");
			} else {
				if (args.length <= 2) {
					args2 = false;
				} else {
					args2 = true;
				}
			}
			if (PlatformUtils.getOSName().equalsIgnoreCase("linux")) {
				TerminalOperations
						.setAdbLocation("adb_linux/platform-tools_linux");
			} else {
				TerminalOperations.setAdbLocation("adb_win/platform-tools_win");
			}
			if (args[0].toString().equalsIgnoreCase("amond")) {
				if (args[1].toString().equalsIgnoreCase("-c") && args2) {
					// Non customized/user defined commands into console with
					// specific device number
					DeviceInfoHandling.getInfoMobile(args[2].toString(), "", "");
				} else if (args[1].toString().equalsIgnoreCase("-csv") && args2) {
					// Non customized/user defined commands with specific device
					// number into csv file
					DeviceInfoHandling.getInfoMobile(args[2].toString(), "-csv", "");
				} else if (args[1].toString().equalsIgnoreCase("-c")) {
					// Non customized/user defined commands into console
					DeviceInfoHandling.getInfoMobile("", "-c", "");
				} else if (args[1].toString().equalsIgnoreCase("-csv")) {
					// Non customized/user defined commands into csv file
					DeviceInfoHandling.getInfoMobile("", "-csv", "");
				} else if (args[1].toString().equalsIgnoreCase("-config") && args[2].toString().equalsIgnoreCase("-c")) {
					// adb commands from csv file and show output in console
					DeviceInfoHandling.getInfoMobile("", "-config", "-c");
				} else if (args[1].toString().equalsIgnoreCase("-config") && args[2].toString().equalsIgnoreCase("-csv")) {
					// adb commands from csv file and show output in csv file.
					DeviceInfoHandling.getInfoMobile("", "-config", "-csv");
				} else if (args[1].toString().equalsIgnoreCase("-h") || args[1].toString().equalsIgnoreCase("-help")) {
					System.out.println("\t This tool will help to find the Android device information");
					System.out.println("");
					System.out.println("\t Console command usage:");
					System.out.println("\t amond [-c] <deviceNumber>");
					System.out.println("\t amond [-csv] <deviceNumber>");
					System.out.println("\t amond [-config] [-c] <deviceNumber>");
					System.out.println("\t amond [-config] [-csv] <deviceNumber>");
					System.out.println("\t\t [*] options are mandatory with command");
					System.out.println("\t\t <*> options are Optional with command");
				}
			} else {
				System.err.println("ERROR: Please enter the argument for info");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

