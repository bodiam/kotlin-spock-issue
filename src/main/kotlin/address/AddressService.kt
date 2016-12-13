package address

import google.*

class AddressService(val googleService: GoogleService) {

	fun search(address: String) : Address {

		return Address(googleService.search(address))
	}
}

data class Address(val value:String)

