package de.synbox.api;

import de.synbox.invoker.ApiClient;
import de.synbox.api.AdminControllerApi;
import de.synbox.api.ApiKeyControllerApi;
import de.synbox.api.BackupManagementApi;
import de.synbox.api.BalanceControllerApi;
import de.synbox.api.BetterAuthMagicLinkWebhookApi;
import de.synbox.api.CloudServerStatusWebhookControllerApi;
import de.synbox.api.ConsoleAuthApi;
import de.synbox.api.ContainerEnvironmentApi;
import de.synbox.api.ContainerLogRestApi;
import de.synbox.api.ContainerPowerManagementApi;
import de.synbox.api.ContainerVolumesApi;
import de.synbox.api.FileManagementApi;
import de.synbox.api.HytaleCurseForgeModControllerApi;
import de.synbox.api.MollieWebhookControllerApi;
import de.synbox.api.NameManagementApi;
import de.synbox.api.OrganizationApi;
import de.synbox.api.PowerLevelControllerApi;
import de.synbox.api.PriceControllerApi;
import de.synbox.api.ScheduleManagementApi;
import de.synbox.api.ServerManagementApi;
import de.synbox.api.SftpManagementApi;
import de.synbox.api.StartStopManagementApi;
import de.synbox.api.TransactionControllerApi;
import de.synbox.api.UserManagementApi;
import de.synbox.api.UserShareManagementApi;
import de.synbox.api.VersionManagementApi;
import de.synbox.api.WebhookManagementApi;

public class ApiFacade {
  private final ApiClient client;

  private AdminControllerApi _adminController;
  private ApiKeyControllerApi _keyController;
  private BackupManagementApi _backupManagement;
  private BalanceControllerApi _balanceController;
  private BetterAuthMagicLinkWebhookApi _betterAuthMagicLinkWebhook;
  private CloudServerStatusWebhookControllerApi _cloudServerStatusWebhookController;
  private ConsoleAuthApi _consoleAuth;
  private ContainerEnvironmentApi _containerEnvironment;
  private ContainerLogRestApi _containerLogRest;
  private ContainerPowerManagementApi _containerPowerManagement;
  private ContainerVolumesApi _containerVolumes;
  private FileManagementApi _fileManagement;
  private HytaleCurseForgeModControllerApi _hytaleCurseForgeModController;
  private MollieWebhookControllerApi _mollieWebhookController;
  private NameManagementApi _nameManagement;
  private OrganizationApi _organization;
  private PowerLevelControllerApi _powerLevelController;
  private PriceControllerApi _priceController;
  private ScheduleManagementApi _scheduleManagement;
  private ServerManagementApi _serverManagement;
  private SftpManagementApi _sftpManagement;
  private StartStopManagementApi _startStopManagement;
  private TransactionControllerApi _transactionController;
  private UserManagementApi _userManagement;
  private UserShareManagementApi _userShareManagement;
  private VersionManagementApi _versionManagement;
  private WebhookManagementApi _webhookManagement;

  public ApiFacade(String baseUrl, String bearerToken) {
    this.client = new ApiClient();
    this.client.setBasePath(baseUrl);
    if (bearerToken != null && !bearerToken.isBlank()) {
      this.client.setApiKey(bearerToken);
    }
  }

  public ApiClient rawClient() { return client; }

  public AdminControllerApi adminController() {
    if (_adminController == null) _adminController = new AdminControllerApi(client);
    return _adminController;
  }
  public ApiKeyControllerApi keyController() {
    if (_keyController == null) _keyController = new ApiKeyControllerApi(client);
    return _keyController;
  }
  public BackupManagementApi backupManagement() {
    if (_backupManagement == null) _backupManagement = new BackupManagementApi(client);
    return _backupManagement;
  }
  public BalanceControllerApi balanceController() {
    if (_balanceController == null) _balanceController = new BalanceControllerApi(client);
    return _balanceController;
  }
  public BetterAuthMagicLinkWebhookApi betterAuthMagicLinkWebhook() {
    if (_betterAuthMagicLinkWebhook == null) _betterAuthMagicLinkWebhook = new BetterAuthMagicLinkWebhookApi(client);
    return _betterAuthMagicLinkWebhook;
  }
  public CloudServerStatusWebhookControllerApi cloudServerStatusWebhookController() {
    if (_cloudServerStatusWebhookController == null) _cloudServerStatusWebhookController = new CloudServerStatusWebhookControllerApi(client);
    return _cloudServerStatusWebhookController;
  }
  public ConsoleAuthApi consoleAuth() {
    if (_consoleAuth == null) _consoleAuth = new ConsoleAuthApi(client);
    return _consoleAuth;
  }
  public ContainerEnvironmentApi containerEnvironment() {
    if (_containerEnvironment == null) _containerEnvironment = new ContainerEnvironmentApi(client);
    return _containerEnvironment;
  }
  public ContainerLogRestApi containerLogRest() {
    if (_containerLogRest == null) _containerLogRest = new ContainerLogRestApi(client);
    return _containerLogRest;
  }
  public ContainerPowerManagementApi containerPowerManagement() {
    if (_containerPowerManagement == null) _containerPowerManagement = new ContainerPowerManagementApi(client);
    return _containerPowerManagement;
  }
  public ContainerVolumesApi containerVolumes() {
    if (_containerVolumes == null) _containerVolumes = new ContainerVolumesApi(client);
    return _containerVolumes;
  }
  public FileManagementApi fileManagement() {
    if (_fileManagement == null) _fileManagement = new FileManagementApi(client);
    return _fileManagement;
  }
  public HytaleCurseForgeModControllerApi hytaleCurseForgeModController() {
    if (_hytaleCurseForgeModController == null) _hytaleCurseForgeModController = new HytaleCurseForgeModControllerApi(client);
    return _hytaleCurseForgeModController;
  }
  public MollieWebhookControllerApi mollieWebhookController() {
    if (_mollieWebhookController == null) _mollieWebhookController = new MollieWebhookControllerApi(client);
    return _mollieWebhookController;
  }
  public NameManagementApi nameManagement() {
    if (_nameManagement == null) _nameManagement = new NameManagementApi(client);
    return _nameManagement;
  }
  public OrganizationApi organization() {
    if (_organization == null) _organization = new OrganizationApi(client);
    return _organization;
  }
  public PowerLevelControllerApi powerLevelController() {
    if (_powerLevelController == null) _powerLevelController = new PowerLevelControllerApi(client);
    return _powerLevelController;
  }
  public PriceControllerApi priceController() {
    if (_priceController == null) _priceController = new PriceControllerApi(client);
    return _priceController;
  }
  public ScheduleManagementApi scheduleManagement() {
    if (_scheduleManagement == null) _scheduleManagement = new ScheduleManagementApi(client);
    return _scheduleManagement;
  }
  public ServerManagementApi serverManagement() {
    if (_serverManagement == null) _serverManagement = new ServerManagementApi(client);
    return _serverManagement;
  }
  public SftpManagementApi sftpManagement() {
    if (_sftpManagement == null) _sftpManagement = new SftpManagementApi(client);
    return _sftpManagement;
  }
  public StartStopManagementApi startStopManagement() {
    if (_startStopManagement == null) _startStopManagement = new StartStopManagementApi(client);
    return _startStopManagement;
  }
  public TransactionControllerApi transactionController() {
    if (_transactionController == null) _transactionController = new TransactionControllerApi(client);
    return _transactionController;
  }
  public UserManagementApi userManagement() {
    if (_userManagement == null) _userManagement = new UserManagementApi(client);
    return _userManagement;
  }
  public UserShareManagementApi userShareManagement() {
    if (_userShareManagement == null) _userShareManagement = new UserShareManagementApi(client);
    return _userShareManagement;
  }
  public VersionManagementApi versionManagement() {
    if (_versionManagement == null) _versionManagement = new VersionManagementApi(client);
    return _versionManagement;
  }
  public WebhookManagementApi webhookManagement() {
    if (_webhookManagement == null) _webhookManagement = new WebhookManagementApi(client);
    return _webhookManagement;
  }
}
