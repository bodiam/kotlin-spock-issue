package test

import spock.lang.Specification

import de.jodamob.kotlin.testrunner.OpenedClasses
import de.jodamob.kotlin.testrunner.SpotlinTestRunner
import org.junit.runner.RunWith

import google.GoogleService
import address.AddressService
import address.Address


@RunWith(SpotlinTestRunner)
@OpenedClasses(GoogleService)
class AddressServiceSpec extends Specification {

	def "find address"() {

		given:
		GoogleService google = Stub(GoogleService)
		google.search(_) >> "my fake location"
		AddressService service = new AddressService(google)

		when:
		Address address = service.search("some input")

		then:
	        address.value == "my fake location"	

	}

}
