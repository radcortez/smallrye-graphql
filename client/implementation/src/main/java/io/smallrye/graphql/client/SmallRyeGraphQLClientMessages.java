package io.smallrye.graphql.client;

import java.util.NoSuchElementException;

import org.jboss.logging.Messages;
import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;

import io.smallrye.graphql.client.dynamic.api.DynamicClientException;

@MessageBundle(projectCode = "SRGQLDC")
public interface SmallRyeGraphQLClientMessages {

    SmallRyeGraphQLClientMessages msg = Messages.getBundle(SmallRyeGraphQLClientMessages.class);

    // numbers reserved for this module are 35000-39999

    @Message(id = 35000, value = "Cannot parse response: %s")
    DynamicClientException cannotParseResponse(String response);

    @Message(id = 35001, value = "URL not configured for client named '%s'. Please define the property smallrye.graphql.client.CLIENT_NAME/url")
    NoSuchElementException urlNotConfiguredForNamedClient(String name);

}
