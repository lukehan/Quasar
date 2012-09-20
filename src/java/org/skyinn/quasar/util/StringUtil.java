/* =====================================================================
 * $Id: StringUtil.java,v 1.2 2004/08/11 13:28:55 l_walker Exp $
 * 
 * Created: [2004-7-25 0:00:43] by Administrator
 * =====================================================================
 * 
 * Quasar
 * 
 * =====================================================================
 * Skyinn Apache Style License v1.0
 * 
 * Copyright (c) Skyinn Group, 2002-2004
 * =====================================================================
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions, and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions, and the disclaimer that follows 
 *    these conditions in the documentation and/or other materials 
 *    provided with the distribution.
 *
 * 3. The name "Skyinn" must not be used to endorse or promote
 *    products derived from this software without prior written permission.
 *    For written permission, please contact walker@skyinn.org.
 *
 * 4. Products derived from this software may not be called "Skyinn",
 *    nor may "Skyinn" appear in their name, without prior written 
 *    permission from Han Qing(walker@skyinn.org).
 *
 * 5. Redistributions of any form whatsoever must retain the following
 *    acknowledgment:
 *    "This product includes software developed by Skyinn Group."
 * 
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR 
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) 
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, 
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING 
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * For more information on Skyinn, please 
 * see <http://www.skyinn.org>.
 * 
 * =====================================================================*/
package org.skyinn.quasar.util;

import org.apache.commons.lang.StringUtils;

/**
 * <p>
 * StringUtil.java
 * </p>
 * 
 * <p>
 * <a href="StringUtil.java.java.html"> <i>View Source </i> </a>
 * </p>
 * 
 * @author $Author: l_walker $
 * @version $Reversion$ $Date: 2004/08/11 13:28:55 $
 */
public final class StringUtil {

	private StringUtil() {
		super();
	}

	/**
	 * UpperCase the first character of the given string.
	 * 
	 * TODO:trim() need?
	 * @param str source string
	 * @return source string with first char be uppercased,
	 * if the first char is NOT letter,return the source string
	 * without convert.
	 */
	public static String upperCaseFirstChar(String str) {
		//if str is null or empty,return
		if (StringUtils.isEmpty(str)) {
			return str;
		}
		//first character
		char c = str.charAt(0);
		//is letter?
		if (Character.isLetter(c)) {
			//uppercase first character
			return Character.toUpperCase(c) + str.substring(1);
		}
		//if the first char in NOT letter,return the source string
		return str;
	}
}