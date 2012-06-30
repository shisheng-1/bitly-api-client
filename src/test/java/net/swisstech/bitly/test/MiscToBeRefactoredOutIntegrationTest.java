/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.swisstech.bitly.test;

import static net.swisstech.bitly.test.util.TestUtil.printAndVerify;
import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.UserPopularLinksExpanded;
import net.swisstech.bitly.model.v3.UserReferrersExpanded;
import net.swisstech.bitly.model.v3.UserReferringDomainsExpanded;

import org.testng.annotations.Test;

public class MiscToBeRefactoredOutIntegrationTest extends AbstractBitlyClientIntegrationTest {

	@Test
	public void callUserPopularLinksExpanded() {
		Response<UserPopularLinksExpanded> resp = getClient().userPopularLinksExpanded() //
				.setUnit("hour") //
				.setUnits(-1) //
				.call();

		printAndVerify(resp, UserPopularLinksExpanded.class);
	}

	@Test
	public void callUserReferrersExpanded() {
		Response<UserReferrersExpanded> resp = getClient().userReferersExpanded() //
				.setUnit("hour") //
				.setUnits(-1) //
				.call();

		printAndVerify(resp, UserReferrersExpanded.class);
	}

	// this returns a 404
	@Test(enabled = false)
	public void callUserReferringDomainsExpanded() {
		Response<UserReferringDomainsExpanded> resp = getClient().userReferringDomainsExpanded() //
				.setUnit("hour") //
				.setUnits(-1) //
				.call();

		printAndVerify(resp, UserReferringDomainsExpanded.class);
	}
}
