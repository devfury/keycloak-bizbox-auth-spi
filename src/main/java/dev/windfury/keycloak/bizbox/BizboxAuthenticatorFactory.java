package dev.windfury.keycloak.bizbox;

import org.keycloak.Config;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class BizboxAuthenticatorFactory implements AuthenticatorFactory {

    private final Logger log = LoggerFactory.getLogger(BizboxAuthenticatorFactory.class);
    public static final String PROVIDER_ID = "bizbox-authenticator";

    AuthenticationExecutionModel.Requirement[] REQUIREMENT_CHOICES = new AuthenticationExecutionModel.Requirement[]{AuthenticationExecutionModel.Requirement.REQUIRED, AuthenticationExecutionModel.Requirement.ALTERNATIVE, AuthenticationExecutionModel.Requirement.DISABLED};


    @Override
    public Authenticator create(KeycloakSession session) {
        return new BizboxAuthenticator(session);
    }

    @Override
    public void init(Config.Scope config) {
        //Initialize the provider
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // Post initialization
    }

    @Override
    public void close() {
        // Close the provider
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getDisplayType() {
        return "Bizbox Authenticator";
    }

    @Override
    public String getReferenceCategory() {
        return null;
    }

    @Override
    public String getHelpText() {
        return "Bizbox authenticator to authenticate the user to an external API";
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return null;
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Override
    public AuthenticationExecutionModel.Requirement[] getRequirementChoices() {
        return REQUIREMENT_CHOICES;
    }

    @Override
    public boolean isUserSetupAllowed() {
        return false;
    }
}
