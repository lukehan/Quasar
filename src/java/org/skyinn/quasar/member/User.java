/* =====================================================================
 * $Id: User.java,v 1.1 2004/07/27 15:04:32 l_walker Exp $
 * 
 * Created: [2004-7-26 14:44:35] by administrator
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
package org.skyinn.quasar.member;

/**
 * <p>User.java</p>
 * 
 * <p>
 * <a href="User.java.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author $Author: l_walker $
 * @version $Reversion$ $Date: 2004/07/27 15:04:32 $
 */
public interface User {
    public static final String USER_KEY = "org.skyinn.quasar.member.User";
    
    public void setId(long id);
    public void setName(String name);
    public void setPassword(String password);
    public void setEmail(String email);
    
    public long getId();
    public String getName();
    public String getPassword();
    public String getEmail(); 
    
}
