/* =====================================================================
 * $Id: AbstractObject.java,v 1.1 2004/07/27 15:04:42 l_walker Exp $
 * 
 * Created: [2004-7-20 15:53:59] by administrator
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
package org.skyinn.quasar.common;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p>Base class for Model objects.</p>
 * This is basically for the toString, equals
 * and hashCode methods.
 * 
 * Reference by :<a href="http://raibledesigns.com/wiki/Wiki.jsp?page=AppFuse">AppFuse</a>'s BaseObject.
 * 
 * <p>
 * <a href="AbstractObject.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author $Author: l_walker $
 * @version $Reversion$ $Date: 2004/07/27 15:04:42 $
 */
public class AbstractObject implements Serializable{
    
    /**
     * Generate a string desc about current class using ToStringBuilder.
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
     * Equals an object using EqualsBuilder.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    /**
     * Generate hashcode using HashCodeBuilder.
     * 
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
