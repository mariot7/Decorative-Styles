package mariot7.decorativestyles.proxy;

import mariot7.decorativestyles.init.BlockListds;
import mariot7.decorativestyles.init.ItemListds;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		BlockListds.registerRenders();
		ItemListds.registerRenders();
	}
}

