/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xasecure.audit.provider;

import org.apache.commons.logging.Log;

public class Log4jTracer implements DebugTracer {
	private Log mLogger = null;

	public Log4jTracer(Log logger) {
		mLogger = logger;
	}

	public void debug(String msg) {
		mLogger.debug(msg);
	}

	public void debug(String msg, Throwable excp) {
		mLogger.debug(msg, excp);
	}

	public void warn(String msg) {
		mLogger.warn(msg);
	}

	public void warn(String msg, Throwable excp) {
		mLogger.warn(msg, excp);
	}

	public void error(String msg) {
		mLogger.error(msg);
	}

	public void error(String msg, Throwable excp) {
		mLogger.error(msg, excp);
	}
}
