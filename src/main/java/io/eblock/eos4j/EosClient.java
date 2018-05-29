package io.eblock.eos4j;

import io.eblock.eos4j.ecc.Ecc;
import io.eblock.eos4j.ese.DataParam;
import io.eblock.eos4j.ese.Ese;

/**
 * EosClient
 * 
 * @author espritblock  http://eblock.io
 *
 */
public class EosClient {

	/**
	 * seedPrivate
	 * 
	 * @param seed
	 * @return
	 */
	public static String seedPrivate(String seed) {
		return Ecc.seedPrivate(seed);
	}

	/**
	 * privateToPublic
	 * 
	 * @param privateKey
	 * @return
	 */
	public static String privateToPublic(String privateKey) {
		return Ecc.privateToPublic(privateKey);
	}

	/**
	 * sign
	 * 
	 * @param privateKey
	 * @param data
	 * @return
	 */
	public static String sign(String privateKey, String data) {
		return Ecc.sign(privateKey, data);
	}
	
	/**
	 * parseData
	 * 
	 * @param data
	 * @return
	 */
	public static String parseData(DataParam [] datas) {
		return Ese.parseData(datas);
	}
}
