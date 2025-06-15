from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    @task
    def get_pet_info(self):
        self.client.get("/v2/pet/1")


    @task
    def post_create_pet(self):

        body_payload = {
  "id": 1,
  "category": {
    "id": 0,
    "name": "string"
  },
  "name": "doggie",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 1,
      "name": "string"
    }
  ],
  "status": "available"
}
        headers_payload= {
           "accept": "application/json",
            "content-type": "application/json"
        }
        self.client.post("/v2/pet", json=body_payload,headers=headers_payload)



    @task
    def put_update_pet(self):

        body_payload =  {
            "id": 1,
            "category": {
                "id": 0,
                "name": "string"
            },
            "name": "doggie",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 0,
                    "name": "dog"
                }
            ],
            "status": "available"
        }
        headers_payload = {
            "accept": "application/json",
            "content-type": "application/json"
        }
        self.client.put("/v2/pet", json=body_payload,headers=headers_payload)

    @task
    def delete_pet(self):
        self.client.delete("/v2/pet/1")











