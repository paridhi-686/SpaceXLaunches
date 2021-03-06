# SpaceXLatestLaunches

Automated Get enrpoint on public api GET https://api.spacexdata.com/v4/launches/latest

Used Restassured dependency in maven

Folder structure

src/main/java 
com.SpaceX.config -config.properties (contains the get url required to be filled in test case) 
com.SpaceX.base - TestSpaceXBase.java (containing logic for reading from the config.properties)

src/test/java - com.SpaceX.test -contains different testcases on get endpoint

Test cases
Verify GET end point on  spacex latestlaunches gives the response 200
Verify GET end point fails if url is tampered
Verify GET end point response data 
Verify GET end point with header passed
Verify GET end point using hamcrest matchers



Response -200

{
	"fairings": {
		"reused": false,
		"recovery_attempt": true,
		"recovered": true,
		"ships": ["5ea6ed2f080df4000697c90b", "5ea6ed2e080df4000697c909"]
	},
	"links": {
		"patch": {
			"small": "https://i.imgur.com/Iphd7Aj.png",
			"large": "https://i.imgur.com/X9q44xx.png"
		},
		"reddit": {
			"campaign": "https://www.reddit.com/r/spacex/comments/n9llxw/sxm8_launch_campaign_thread/",
			"launch": "https://www.reddit.com/r/spacex/comments/nss9br/rspacex_sxm8_launch_discussion_and_updates_thread/",
			"media": null,
			"recovery": null
		},
		"flickr": {
			"small": [],
			"original": []
		},
		"presskit": null,
		"webcast": "https://youtu.be/bgtDRR2F2wA",
		"youtube_id": "bgtDRR2F2wA",
		"article": null,
		"wikipedia": "https://en.wikipedia.org/wiki/Sirius_XM#Satellites"
	},
	"static_fire_date_utc": "2021-06-03T06:32:00.000Z",
	"static_fire_date_unix": 1622701920,
	"tbd": false,
	"net": false,
	"window": 5940,
	"rocket": "5e9d0d95eda69973a809d1ec",
	"success": true,
	"details": "SpaceX launches the second of two next generation satellites for SiriusXM from SLC-40, Cape Canaveral Space Force Station. The spacecraft will be delivered into a sub-synchronous geostationary transfer orbit and will replace XM-4 in geostationary orbit. The booster for this mission will land on an ASDS.",
	"crew": [],
	"ships": ["5ee68c683c228f36bd5809b5", "5ea6ed2f080df4000697c910", "5ea6ed2f080df4000697c90b", "5ea6ed2e080df4000697c909"],
	"capsules": [],
	"payloads": ["5fe3b57db3467846b324217a"],
	"launchpad": "5e9e4501f509094ba4566f84",
	"auto_update": true,
	"launch_library_id": "edaf9a8d-d67c-4e0e-8452-a37b111581d5",
	"failures": [],
	"flight_number": 130,
	"name": "SXM-8",
	"date_utc": "2021-06-06T04:26:00.000Z",
	"date_unix": 1622953560,
	"date_local": "2021-06-06T00:26:00-04:00",
	"date_precision": "hour",
	"upcoming": false,
	"cores": [{
		"core": "5f57c53d0622a6330279009f",
		"flight": 3,
		"gridfins": true,
		"legs": true,
		"reused": true,
		"landing_attempt": true,
		"landing_success": true,
		"landing_type": "ASDS",
		"landpad": "5e9e3033383ecbb9e534e7cc"
	}],
	"id": "5fe3af6db3467846b3242160"
}

