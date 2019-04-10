package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        url "/api/v1/stations/14"
        method GET()

    }

    response {
        status OK()
        body("""
[
    {
        "id": 88,
        "stationId": 14,
        "param": {
            "paramName": "dwutlenek azotu",
            "paramFormula": "NO2",
            "paramCode": "NO2",
            "idParam": 6
        }
    },
    {
        "id": 92,
        "stationId": 14,
        "param": {
            "paramName": "pył zawieszony PM10",
            "paramFormula": "PM10",
            "paramCode": "PM10",
            "idParam": 3
        }
    },
    {
        "id": 94,
        "stationId": 14,
        "param": {
            "paramName": "dwutlenek siarki",
            "paramFormula": "SO2",
            "paramCode": "SO2",
            "idParam": 1
        }
    }
]
""")

        headers {
            contentType(applicationJsonUtf8())
        }
    }
}