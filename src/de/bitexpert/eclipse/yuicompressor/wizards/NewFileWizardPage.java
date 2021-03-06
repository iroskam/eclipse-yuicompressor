/*
 * Copyright (c) 2007-2012 bitExpert AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


package de.bitexpert.eclipse.yuicompressor.wizards;


import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


/**
 * New File Wizard Page
 *
 * @author	Stephan Hochdörfer <S.Hochdoerfer@bitExpert.de>
 */


public class NewFileWizardPage extends WizardNewFileCreationPage
{
	/**
	 * Creates a new {@link NewFileWizardPage}.
	 *
	 * @param selection
	 */
	public NewFileWizardPage(IStructuredSelection selection)
	{
		super("New File", selection);
		setTitle("Choose target file");
		setDescription("Creates a new output file");
	}
}