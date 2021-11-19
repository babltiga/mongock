package io.mongock.driver.dynamodb.springboot.config

import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput
import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties("mongock.dynamo-db")
class DynamoDBConfiguration {
    var provisionedThroughput = ProvisionedThroughput(50L, 50L)

}
