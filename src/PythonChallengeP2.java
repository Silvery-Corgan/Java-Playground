public class PythonChallengeP2
{
	public static String z = new String("g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.");
	public static String y = new String("map");

	// k -> L -> M
	// O -> P -> Q
	// E -> F -> G

	public static String translateStr(String x)
	{
		String decrypt = "";

		for (int i = 0; i < x.length(); ++i)
		{
			if (97 > (int) x.charAt(i) || (int) x.charAt(i) > 122)
			{
				decrypt += String.valueOf(x.charAt(i));
				continue;
			}
			int iY = (int) x.charAt(i) + 2;
			if (iY > 122)
			{
				iY = iY - 26;
			}
			decrypt += String.valueOf((char) (iY));
		}
		return decrypt;
	}

	public static void main(String[] args)
	{
		System.out.println(translateStr(z));
		System.out.println("To go to next problem: " + translateStr(y));
	}
}