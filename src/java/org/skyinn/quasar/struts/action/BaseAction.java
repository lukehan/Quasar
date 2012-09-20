/* =====================================================================
 * $Id: BaseAction.java,v 1.3 2004/08/15 01:40:11 l_walker Exp $
 * 
 * Created: [2004-7-23 9:41:57] by administrator
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
package org.skyinn.quasar.struts.action;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.actions.DispatchAction;
import org.skyinn.quasar.service.Service;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * <p>BaseAction.java</p>
 * 
 * <p>
 * <a href="BaseAction.java.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author $Author: l_walker $
 * @version $Reversion$ $Date: 2004/08/15 01:40:11 $
 */
public class BaseAction extends DispatchAction{
	protected static Log log = LogFactory.getLog(BaseAction.class);
    private static ApplicationContext ctx = null;

	/**
	 * @see org.apache.struts.actions.LookupDispatchAction#getKeyMethodMap()
	 */
	protected Map getKeyMethodMap() {
        Map map = new HashMap();

        String pkg = this.getClass().getPackage().getName();
        ResourceBundle methods =
                ResourceBundle.getBundle(pkg + ".LookupMethods");

        Enumeration keys = methods.getKeys();

        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            map.put(key, methods.getString(key));
        }

        return map;
	}
	
    public Service getService(String servicName) {
        if (ctx == null) {
            ctx = WebApplicationContextUtils
                    .getRequiredWebApplicationContext(servlet.getServletContext());
        }
        
        Service s = null;
        //TODO:exception catch...
		try {
			s = (Service)ctx.getBean(servicName);
		} catch (BeansException e) {
			e.printStackTrace();
		}
		return s;
    }
}
