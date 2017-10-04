/**
 * Copyright (c) 2000-2005 Liferay, LLC. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.events;

import com.dotcms.repackage.org.apache.logging.log4j.Level;
import com.dotcms.repackage.org.apache.logging.log4j.LogManager;
import com.dotcms.repackage.org.apache.logging.log4j.core.Appender;
import com.dotcms.repackage.org.apache.logging.log4j.core.Logger;
import com.dotcms.repackage.org.dom4j.Document;
import com.dotcms.repackage.org.dom4j.Element;
import com.dotcms.repackage.org.dom4j.io.SAXReader;
import com.dotmarketing.loggers.Log4jUtil;
import com.liferay.portal.struts.ActionException;
import com.liferay.portal.struts.SimpleAction;
import com.liferay.portal.util.PropsUtil;
import com.liferay.util.GetterUtil;
import com.liferay.util.ServerDetector;
import com.liferay.util.SystemProperties;
import com.liferay.util.Validator;

import java.net.URL;
import java.util.*;

/**
 * <a href="InitAction.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 * @version $Revision: 1.18 $
 *
 */
public class InitAction extends SimpleAction {

	public void run(String[] ids) throws ActionException {

		// Set default locale

		String userLanguage = SystemProperties.get("user.language");
		String userCountry = SystemProperties.get("user.country");
		String userVariant = SystemProperties.get("user.variant");

		if (Validator.isNull(userVariant)) {
			Locale.setDefault(new Locale(userLanguage, userCountry));
		}
		else {
			Locale.setDefault(
				new Locale(userLanguage, userCountry, userVariant));
		}

		// Log4J

		/*if (GetterUtil.get(PropsUtil.get(
				PropsUtil.LOG_CONFIGURE_LOG4J), true) &&
			!ServerDetector.isSun()) {

			URL portalLog4jUrl = getClass().getClassLoader().getResource(
				"META-INF/portal-log4j.xml");

			com.dotcms.repackage.org.apache.logging.log4j.Logger logger = LogManager.getRootLogger();
			//Getting all the appenders for this logger
			Map<String, Appender> appenderMap = ((Logger) logger).getAppenders();
			if ( appenderMap.isEmpty() && portalLog4jUrl != null) {
				//Initialises/reconfigures log4j based on a given log4j configuration file
				Log4jUtil.initializeFromPath(portalLog4jUrl.toString());
			}
			else {
				Set currentLoggerNames = new HashSet();

				//Getting all the registered loggers
				Collection<Logger> loggers = Log4jUtil.getLoggers();

				Iterator<Logger> loggerIterator = loggers.iterator();
				while ( loggerIterator.hasNext() ) {
					Logger currentLogger = loggerIterator.next();
					currentLoggerNames.add(currentLogger.getName());
				}

				try {
					SAXReader reader = new SAXReader();

					Document doc = reader.read(portalLog4jUrl);

					Element root = doc.getRootElement();

					Iterator itr = root.elements("category").iterator();

					while (itr.hasNext()) {
						Element category = (Element)itr.next();

						String name = category.attributeValue("name");
						String priority =
							category.element(
								"priority").attributeValue("value");

						//Search for the logger and change the priority
						Logger currentLogger = (Logger) LogManager.getLogger(name);
						Log4jUtil.setLevel(currentLogger, Level.toLevel(priority));
					}
				}
				catch (Exception e) {
					com.dotmarketing.util.Logger.error(this,e.getMessage(),e);
				}
			}
		}*/
	}

}